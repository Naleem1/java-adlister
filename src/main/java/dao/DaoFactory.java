package dao;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = (Ads) new MySQLAdsDao();
        }
        return adsDao;
    }
}