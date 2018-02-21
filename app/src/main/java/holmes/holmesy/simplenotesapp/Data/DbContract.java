package holmes.holmesy.simplenotesapp.Data;

import android.provider.BaseColumns;

/**
 * Created by Holmesy on 21/02/2018.
 */

public class DbContract {

    private DbContract(){}



    public static class NoteEntry implements BaseColumns{

        public static final String TABLE_NAME = "notes";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";


    }
}
