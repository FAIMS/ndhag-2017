package au.org.intersect.faims.android.util;

import android.view.View;
import android.widget.EditText;

import com.robotium.solo.Solo;

public class ModuleUtil extends ModuleHelper {
    /*
        Type: tab group
        Ref:  Brick
     */
    public static View get_Brick(Solo solo) {
        String ref = "Brick";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  Start
     */
    public static View get_Start(Solo solo) {
        String ref = "Start";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab group
        Ref:  User_Login
     */
    public static View get_UserLogin(Solo solo) {
        String ref = "User_Login";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: tab
        Ref:  Brick/Description
     */
    public static View get_Brick_Description(Solo solo) {
        String ref = "Brick/Description";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Brick/Site
     */
    public static View get_Brick_Site(Solo solo) {
        String ref = "Brick/Site";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Start/Main
     */
    public static View get_Start_Main(Solo solo) {
        String ref = "Start/Main";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  Start/Map
     */
    public static View get_Start_Map(Solo solo) {
        String ref = "Start/Map";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: tab
        Ref:  User_Login/User
     */
    public static View get_UserLogin_User(Solo solo) {
        String ref = "User_Login/User";
        return (android.view.View) solo.getView((Object) ref);
    }
    /*
        Type: button
        Ref:  Brick/Description/Brick_Photo_Button_1
     */
    public static View get_Brick_Description_BrickPhotoButton1(Solo solo) {
        String ref = "Brick/Description/Brick_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Brick/Description/Frog_Photo_Button_1
     */
    public static View get_Brick_Description_FrogPhotoButton1(Solo solo) {
        String ref = "Brick/Description/Frog_Photo_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Brick/Site/Location_Plans_Button_1
     */
    public static View get_Brick_Site_LocationPlansButton1(Solo solo) {
        String ref = "Brick/Site/Location_Plans_Button_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Brick/Site/Take_From_GPS_1
     */
    public static View get_Brick_Site_TakeFromGPS1(Solo solo) {
        String ref = "Brick/Site/Take_From_GPS_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Start/Main/Create_new_Record
     */
    public static View get_Start_Main_CreatenewRecord(Solo solo) {
        String ref = "Start/Main/Create_new_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Start/Map/Center_Me_1
     */
    public static View get_Start_Map_CenterMe1(Solo solo) {
        String ref = "Start/Map/Center_Me_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Start/Map/Create_Record
     */
    public static View get_Start_Map_CreateRecord(Solo solo) {
        String ref = "Start/Map/Create_Record";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Start/Map/Save_Map_Settings_1
     */
    public static View get_Start_Map_SaveMapSettings1(Solo solo) {
        String ref = "Start/Map/Save_Map_Settings_1";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: button
        Ref:  Start/Search/Search_Button
     */
    public static View get_Start_Search_SearchButton(Solo solo) {
        String ref = "Start/Search/Search_Button";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Brick/Description/Brick_Photo
     */
    public static View get_Brick_Description_BrickPhoto(Solo solo) {
        String ref = "Brick/Description/Brick_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Brick/Description/Frog_Photo
     */
    public static View get_Brick_Description_FrogPhoto(Solo solo) {
        String ref = "Brick/Description/Frog_Photo";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: camera
        Ref:  Brick/Site/Location_Plans
     */
    public static View get_Brick_Site_LocationPlans(Solo solo) {
        String ref = "Brick/Site/Location_Plans";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: checkbox
        Ref:  Brick/Description/Colour
     */
    public static View get_Brick_Description_Colour(Solo solo) {
        String ref = "Brick/Description/Colour";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Brick/Description/Frog_Type
     */
    public static View get_Brick_Description_FrogType(Solo solo) {
        String ref = "Brick/Description/Frog_Type";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: dropdown
        Ref:  Brick/Description/Technology
     */
    public static View get_Brick_Description_Technology(Solo solo) {
        String ref = "Brick/Description/Technology";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: gpsdiag
        Ref:  Start/Main/GPS_Diagnostics
     */
    public static View get_Start_Main_GPSDiagnostics(Solo solo) {
        String ref = "Start/Main/GPS_Diagnostics";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Checked_by
     */
    public static EditText get_Brick_Description_Checkedby(Solo solo) {
        String ref = "Brick/Description/Checked_by";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Date_Checked
     */
    public static EditText get_Brick_Description_DateChecked(Solo solo) {
        String ref = "Brick/Description/Date_Checked";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Frog_Notes
     */
    public static EditText get_Brick_Description_FrogNotes(Solo solo) {
        String ref = "Brick/Description/Frog_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Height_cm
     */
    public static EditText get_Brick_Description_Heightcm(Solo solo) {
        String ref = "Brick/Description/Height_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Length_cm
     */
    public static EditText get_Brick_Description_Lengthcm(Solo solo) {
        String ref = "Brick/Description/Length_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Material_Notes
     */
    public static EditText get_Brick_Description_MaterialNotes(Solo solo) {
        String ref = "Brick/Description/Material_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Preservation
     */
    public static EditText get_Brick_Description_Preservation(Solo solo) {
        String ref = "Brick/Description/Preservation";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Shape_Notes
     */
    public static EditText get_Brick_Description_ShapeNotes(Solo solo) {
        String ref = "Brick/Description/Shape_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Validate
     */
    public static EditText get_Brick_Description_Validate(Solo solo) {
        String ref = "Brick/Description/Validate";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Weight_g
     */
    public static EditText get_Brick_Description_Weightg(Solo solo) {
        String ref = "Brick/Description/Weight_g";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Description/Width_cm
     */
    public static EditText get_Brick_Description_Widthcm(Solo solo) {
        String ref = "Brick/Description/Width_cm";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Accuracy
     */
    public static View get_Brick_Site_Accuracy(Solo solo) {
        String ref = "Brick/Site/Accuracy";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Brick_ID
     */
    public static EditText get_Brick_Site_BrickID(Solo solo) {
        String ref = "Brick/Site/Brick_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Created_at
     */
    public static EditText get_Brick_Site_Createdat(Solo solo) {
        String ref = "Brick/Site/Created_at";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Easting
     */
    public static View get_Brick_Site_Easting(Solo solo) {
        String ref = "Brick/Site/Easting";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Latitude
     */
    public static View get_Brick_Site_Latitude(Solo solo) {
        String ref = "Brick/Site/Latitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Location
     */
    public static EditText get_Brick_Site_Location(Solo solo) {
        String ref = "Brick/Site/Location";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Location_Notes
     */
    public static EditText get_Brick_Site_LocationNotes(Solo solo) {
        String ref = "Brick/Site/Location_Notes";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Longitude
     */
    public static View get_Brick_Site_Longitude(Solo solo) {
        String ref = "Brick/Site/Longitude";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Northing
     */
    public static View get_Brick_Site_Northing(Solo solo) {
        String ref = "Brick/Site/Northing";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Postcode
     */
    public static EditText get_Brick_Site_Postcode(Solo solo) {
        String ref = "Brick/Site/Postcode";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Street_Name
     */
    public static EditText get_Brick_Site_StreetName(Solo solo) {
        String ref = "Brick/Site/Street_Name";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Street_no
     */
    public static EditText get_Brick_Site_Streetno(Solo solo) {
        String ref = "Brick/Site/Street_no";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Brick/Site/Suburb
     */
    public static EditText get_Brick_Site_Suburb(Solo solo) {
        String ref = "Brick/Site/Suburb";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Start/Main/Next_Brick_ID
     */
    public static EditText get_Start_Main_NextBrickID(Solo solo) {
        String ref = "Start/Main/Next_Brick_ID";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: input
        Ref:  Start/Search/Search_Term
     */
    public static EditText get_Start_Search_SearchTerm(Solo solo) {
        String ref = "Start/Search/Search_Term";
        return (android.widget.EditText) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  Start/Search/Entity_List
     */
    public static View get_Start_Search_EntityList(Solo solo) {
        String ref = "Start/Search/Entity_List";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: list
        Ref:  User_Login/User/User
     */
    public static View get_UserLogin_User_User(Solo solo) {
        String ref = "User_Login/User/User";
        return (android.view.View) solo.getView((Object) ref);
    }

    /*
        Type: map
        Ref:  Start/Map/Map
     */
    public static View get_Start_Map_Map(Solo solo) {
        String ref = "Start/Map/Map";
        return (android.view.View) solo.getView((Object) ref);
    }
}
