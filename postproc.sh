#!/usr/bin/env bash

# Start working on our module definition files...
cd module

# In the ui_schema.xml, replace the "Entity Types" dropdown menu with an
# "Entity Types" dropdown, a "Select User" dropdown, and a "Select Square"
# dropdown. These new three dropdowns will appear in columns because of our use
# of the `<group>` element and `faims_style` attribute. (Check the FAIMS
# cookbook for more info.)
string="
        <select1 appearance=\"compact\" ref=\"Entity_List\">
          <label>\{Entity_List\}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>\{Select_User\}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Date\">
              <label>\{Select_Date\}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_2\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Frog_Type\">
              <label>\{Select_Frog_Type\}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>
        <select1 appearance=\"compact\" ref=\"Entity_List\">
          <label>\{Entity_List\}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

# The UI schema requires that we also define the dropdowns in its <model> tags.
string="
              <Entity_List\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Select_User\/>
                <\/Col_0>
                <Col_1>
                  <Select_Date\/>
                <\/Col_1>
                <Col_2>
                  <Select_Frog_Type\/>
                <\/Col_2>
              <\/Colgroup_1>
              <Select_User\/>
              <Entity_List\/>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

# Add entries to the arch16n file. This includes new entries for the "Select
# User" and "Select Square" dropdowns.
cat << EOF >> english.0.properties
Select_Date=Select Date
Select_Frog_Type=Select Frog Type
Select_User=Select User
EOF

# Perl created backup files when we modified the UI schema and validation
# schema. They're not needed any more.
rm ui_schema.xml.original
