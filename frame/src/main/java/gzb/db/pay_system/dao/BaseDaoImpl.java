package gzb.db.pay_system.dao;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.entity.PsAdmin;
import gzb.db.pay_system.entity.PsApp;
import gzb.db.pay_system.entity.PsDev;
import gzb.db.pay_system.entity.PsOrder;
import gzb.db.pay_system.entity.PsUser;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import gzb.tools.ListPage;
import gzb.tools.Tools;
import gzb.tools.cache.Cache;
import gzb.tools.entity.AutoSqlEntity;
import gzb.tools.log.Log;
import gzb.tools.log.LogImpl;

public class BaseDaoImpl implements BaseDao {
    static Log Log=new LogImpl(BaseDaoImpl.class);
    public final List<PsAdmin> psAdminToList(String json) {
        List<PsAdmin> list = new ArrayList<>();
        if (json.length()<3){
            return list;
        }
        json = json.substring(2, json.length() - 2);
        String[] ss1 = json.replaceAll("}, \\{", "},{").split("},\\{");
        for (int i = 0; i < ss1.length; i++) {
            list.add(new PsAdmin("{" + ss1[i] + "}"));
        }
        return list;
    }
    public final List<PsApp> psAppToList(String json) {
        List<PsApp> list = new ArrayList<>();
        if (json.length()<3){
            return list;
        }
        json = json.substring(2, json.length() - 2);
        String[] ss1 = json.replaceAll("}, \\{", "},{").split("},\\{");
        for (int i = 0; i < ss1.length; i++) {
            list.add(new PsApp("{" + ss1[i] + "}"));
        }
        return list;
    }
    public final List<PsDev> psDevToList(String json) {
        List<PsDev> list = new ArrayList<>();
        if (json.length()<3){
            return list;
        }
        json = json.substring(2, json.length() - 2);
        String[] ss1 = json.replaceAll("}, \\{", "},{").split("},\\{");
        for (int i = 0; i < ss1.length; i++) {
            list.add(new PsDev("{" + ss1[i] + "}"));
        }
        return list;
    }
    public final List<PsOrder> psOrderToList(String json) {
        List<PsOrder> list = new ArrayList<>();
        if (json.length()<3){
            return list;
        }
        json = json.substring(2, json.length() - 2);
        String[] ss1 = json.replaceAll("}, \\{", "},{").split("},\\{");
        for (int i = 0; i < ss1.length; i++) {
            list.add(new PsOrder("{" + ss1[i] + "}"));
        }
        return list;
    }
    public final List<PsUser> psUserToList(String json) {
        List<PsUser> list = new ArrayList<>();
        if (json.length()<3){
            return list;
        }
        json = json.substring(2, json.length() - 2);
        String[] ss1 = json.replaceAll("}, \\{", "},{").split("},\\{");
        for (int i = 0; i < ss1.length; i++) {
            list.add(new PsUser("{" + ss1[i] + "}"));
        }
        return list;
    }
    @Override
    public PsAdmin psAdminFind(Long ps_admin_id) {
        List<PsAdmin> list = psAdminQuery("select * from "+DataBase.psAdminName+" where ps_admin_id=?", Tools.toArray(ps_admin_id));
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsAdmin psAdminFind(String sql, Object[] arr) {
        List<PsAdmin> list = psAdminQuery(sql, arr);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsAdmin psAdminFind(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toSelect();
        List<PsAdmin> list = psAdminQuery(ase.sql, ase.objs);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsAdmin psAdminFindCache(PsAdmin psAdmin,int mm) {
        AutoSqlEntity ase = psAdmin.toSelect();
        List<PsAdmin> list = psAdminQueryCache(ase.sql, ase.objs,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    public PsAdmin psAdminFindCache(Long ps_admin_id,int mm) {
        List<PsAdmin> list = psAdminQueryCache("select * from "+DataBase.psAdminName+" where ps_admin_id=?", Tools.toArray(ps_admin_id),mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsAdmin psAdminFindCache(String sql, Object[] arr,int mm) {
        List<PsAdmin> list = psAdminQueryCache(sql, arr,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<PsAdmin> psAdminQuery(String sql, Object[] arr) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (arr == null) {
            arr = Tools.toArray();
        }
        List<PsAdmin> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(";参数:");
        try {
            conn = DataBase.db.getConnection();
            ps = conn.prepareStatement(sql);
            PsAdmin en;
            String temp = "";
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(",");
                ps.setObject(i + 1, arr[i].toString());
            }
            long t1 = new Date().getTime();
            rs = ps.executeQuery();
            long t2 = new Date().getTime();
            sb.append(";查询耗时:").append(t2 - t1).append("毫秒");
            t1 = new Date().getTime();
            String a = "," + Tools.textMid(sql, "select ", " from", 1).replaceAll(" ", "") + ",";
            while (rs.next()) {
                en = new PsAdmin();
                if (a.equals(",*,") || a.indexOf(",psAdminId,") > -1 || a.indexOf(",ps_admin_id,") > -1) {
                    temp = rs.getString("ps_admin_id");
                    if (temp != null) {
                        en.setPsAdminId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAdminAcc,") > -1 || a.indexOf(",ps_admin_acc,") > -1) {
                    temp = rs.getString("ps_admin_acc");
                    if (temp != null) {
                        en.setPsAdminAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAdminPwd,") > -1 || a.indexOf(",ps_admin_pwd,") > -1) {
                    temp = rs.getString("ps_admin_pwd");
                    if (temp != null) {
                        en.setPsAdminPwd(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAdminState,") > -1 || a.indexOf(",ps_admin_state,") > -1) {
                    temp = rs.getString("ps_admin_state");
                    if (temp != null) {
                        en.setPsAdminState(java.lang.Integer.valueOf(temp));
                    }
                }
                list.add(en);
            }
            t2 = new Date().getTime();
            sb.append(";组装对象耗时:").append(t2 - t1).append("毫秒");
            Log.sql(sb.toString());
        } catch (Exception e) {
            Log.e(e, sb.toString());
        } finally {
            DataBase.db.close(conn, rs, ps);
        }
        return list;
    }

    @Override
    public List<PsAdmin> psAdminQuery(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toSelect();
        return psAdminQuery(ase.sql, ase.objs);
    }

    @Override
    public ListPage psAdminQuery(String sql, Object[] arr, int page, int limit) {
        ListPage listPage = new ListPage();
        List<PsAdmin> list = psAdminQuery(sql, arr);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psAdminQuery(PsAdmin psAdmin, int page, int limit, int maxPage, int maxLimit) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page>maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psAdmin.toSelect();
        List<PsAdmin> list = psAdminQuery(ase.sql + " limit "+(maxPage*limit), ase.objs);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public List<PsAdmin> psAdminQueryCache(String sql, Object[] arr, int mm) {
        List<PsAdmin> list = new ArrayList<>();
        String key = DataBase.db.getKey(sql, arr);
        String str = Cache.gzbCache.get(key);
        if (str == null) {
            Log.sql("Miss:" + key);
            list = psAdminQuery(sql, arr);
            Cache.gzbCache.set(key, list.toString(), mm);
        } else {
            Log.sql("Hit:" + key);
            list = psAdminToList(str);
        }
        return list;
    }
    @Override
    public List<PsAdmin> psAdminQueryCache(PsAdmin psAdmin, int mm) {
        AutoSqlEntity ase = psAdmin.toSelect();
        return psAdminQueryCache(ase.sql, ase.objs, mm);
    }

    @Override
    public ListPage psAdminQueryCache(String sql, Object[] arr, int page, int limit, int mm) {
        ListPage listPage = new ListPage();
        List<PsAdmin> list = psAdminQueryCache(sql, arr, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psAdminQueryCache(PsAdmin psAdmin, int page, int limit, int maxPage, int maxLimit, int mm) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page > maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psAdmin.toSelect();
        List<PsAdmin> list = psAdminQueryCache(ase.sql+ " limit "+(maxPage*limit), ase.objs, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public int psAdminDelete(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toDelete();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psAdminInsert(PsAdmin psAdmin) {
        psAdmin.setPsAdminId(DataBase.db.getOnlyIdDistributed());
        AutoSqlEntity ase = psAdmin.toInsert();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psAdminUpdate(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toUpdate();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }


    @Override
    public int psAdminInsertAsy(PsAdmin psAdmin) {
        return psAdminInsertAsy(psAdmin, true);
    }

    @Override
    public int psAdminInsertAsy(PsAdmin psAdmin, boolean auto) {
        if (auto) {
            psAdmin.setPsAdminId(DataBase.db.getOnlyIdDistributed());
        }
        AutoSqlEntity ase = psAdmin.toInsert();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAdminDeleteAsy(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAdminUpdateAsy(PsAdmin psAdmin) {
        AutoSqlEntity ase = psAdmin.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAdminBatch(List<PsAdmin> list) {
        return psAdminBatch(list, true);
    }

    @Override
    public int psAdminBatch(List<PsAdmin> list, boolean autoId) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (autoId) {
                    list.get(i).setPsAdminId(DataBase.db.getOnlyIdDistributed());
                }
                AutoSqlEntity ase = list.get(i).toInsert();
                if (i == 0) {
                    sb.append("Batch:").append(ase.sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(ase.sql);
                }
                for (int i1 = 0; i1 < ase.objs.length; i1++) {
                    ps.setObject(i1 + 1, ase.objs[i1]);
                }
                sb.append(DataBase.db.getKey(ase.sql, ase.objs));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public int psAdminBatch(String sql, List<Object[]> list) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    sb.append("Batch:").append(sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(sql);
                }
                for (int i1 = 0; i1 < list.get(i).length; i1++) {
                    ps.setObject(i1 + 1, list.get(i)[i1]);
                }
                sb.append(DataBase.db.getKey(sql, list.get(i)));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public PsApp psAppFind(Long ps_app_id) {
        List<PsApp> list = psAppQuery("select * from "+DataBase.psAppName+" where ps_app_id=?", Tools.toArray(ps_app_id));
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsApp psAppFind(String sql, Object[] arr) {
        List<PsApp> list = psAppQuery(sql, arr);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsApp psAppFind(PsApp psApp) {
        AutoSqlEntity ase = psApp.toSelect();
        List<PsApp> list = psAppQuery(ase.sql, ase.objs);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsApp psAppFindCache(PsApp psApp,int mm) {
        AutoSqlEntity ase = psApp.toSelect();
        List<PsApp> list = psAppQueryCache(ase.sql, ase.objs,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    public PsApp psAppFindCache(Long ps_app_id,int mm) {
        List<PsApp> list = psAppQueryCache("select * from "+DataBase.psAppName+" where ps_app_id=?", Tools.toArray(ps_app_id),mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsApp psAppFindCache(String sql, Object[] arr,int mm) {
        List<PsApp> list = psAppQueryCache(sql, arr,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<PsApp> psAppQuery(String sql, Object[] arr) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (arr == null) {
            arr = Tools.toArray();
        }
        List<PsApp> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(";参数:");
        try {
            conn = DataBase.db.getConnection();
            ps = conn.prepareStatement(sql);
            PsApp en;
            String temp = "";
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(",");
                ps.setObject(i + 1, arr[i].toString());
            }
            long t1 = new Date().getTime();
            rs = ps.executeQuery();
            long t2 = new Date().getTime();
            sb.append(";查询耗时:").append(t2 - t1).append("毫秒");
            t1 = new Date().getTime();
            String a = "," + Tools.textMid(sql, "select ", " from", 1).replaceAll(" ", "") + ",";
            while (rs.next()) {
                en = new PsApp();
                if (a.equals(",*,") || a.indexOf(",psAppId,") > -1 || a.indexOf(",ps_app_id,") > -1) {
                    temp = rs.getString("ps_app_id");
                    if (temp != null) {
                        en.setPsAppId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppName,") > -1 || a.indexOf(",ps_app_name,") > -1) {
                    temp = rs.getString("ps_app_name");
                    if (temp != null) {
                        en.setPsAppName(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppAesPwd,") > -1 || a.indexOf(",ps_app_aes_pwd,") > -1) {
                    temp = rs.getString("ps_app_aes_pwd");
                    if (temp != null) {
                        en.setPsAppAesPwd(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppAesIv,") > -1 || a.indexOf(",ps_app_aes_iv,") > -1) {
                    temp = rs.getString("ps_app_aes_iv");
                    if (temp != null) {
                        en.setPsAppAesIv(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppRetUrl,") > -1 || a.indexOf(",ps_app_ret_url,") > -1) {
                    temp = rs.getString("ps_app_ret_url");
                    if (temp != null) {
                        en.setPsAppRetUrl(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppState,") > -1 || a.indexOf(",ps_app_state,") > -1) {
                    temp = rs.getString("ps_app_state");
                    if (temp != null) {
                        en.setPsAppState(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppUserId,") > -1 || a.indexOf(",ps_app_user_id,") > -1) {
                    temp = rs.getString("ps_app_user_id");
                    if (temp != null) {
                        en.setPsAppUserId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppAdminId,") > -1 || a.indexOf(",ps_app_admin_id,") > -1) {
                    temp = rs.getString("ps_app_admin_id");
                    if (temp != null) {
                        en.setPsAppAdminId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppUserAcc,") > -1 || a.indexOf(",ps_app_user_acc,") > -1) {
                    temp = rs.getString("ps_app_user_acc");
                    if (temp != null) {
                        en.setPsAppUserAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psAppAdminAcc,") > -1 || a.indexOf(",ps_app_admin_acc,") > -1) {
                    temp = rs.getString("ps_app_admin_acc");
                    if (temp != null) {
                        en.setPsAppAdminAcc(java.lang.String.valueOf(temp));
                    }
                }
                list.add(en);
            }
            t2 = new Date().getTime();
            sb.append(";组装对象耗时:").append(t2 - t1).append("毫秒");
            Log.sql(sb.toString());
        } catch (Exception e) {
            Log.e(e, sb.toString());
        } finally {
            DataBase.db.close(conn, rs, ps);
        }
        return list;
    }

    @Override
    public List<PsApp> psAppQuery(PsApp psApp) {
        AutoSqlEntity ase = psApp.toSelect();
        return psAppQuery(ase.sql, ase.objs);
    }

    @Override
    public ListPage psAppQuery(String sql, Object[] arr, int page, int limit) {
        ListPage listPage = new ListPage();
        List<PsApp> list = psAppQuery(sql, arr);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psAppQuery(PsApp psApp, int page, int limit, int maxPage, int maxLimit) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page>maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psApp.toSelect();
        List<PsApp> list = psAppQuery(ase.sql + " limit "+(maxPage*limit), ase.objs);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public List<PsApp> psAppQueryCache(String sql, Object[] arr, int mm) {
        List<PsApp> list = new ArrayList<>();
        String key = DataBase.db.getKey(sql, arr);
        String str = Cache.gzbCache.get(key);
        if (str == null) {
            Log.sql("Miss:" + key);
            list = psAppQuery(sql, arr);
            Cache.gzbCache.set(key, list.toString(), mm);
        } else {
            Log.sql("Hit:" + key);
            list = psAppToList(str);
        }
        return list;
    }
    @Override
    public List<PsApp> psAppQueryCache(PsApp psApp, int mm) {
        AutoSqlEntity ase = psApp.toSelect();
        return psAppQueryCache(ase.sql, ase.objs, mm);
    }

    @Override
    public ListPage psAppQueryCache(String sql, Object[] arr, int page, int limit, int mm) {
        ListPage listPage = new ListPage();
        List<PsApp> list = psAppQueryCache(sql, arr, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psAppQueryCache(PsApp psApp, int page, int limit, int maxPage, int maxLimit, int mm) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page > maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psApp.toSelect();
        List<PsApp> list = psAppQueryCache(ase.sql+ " limit "+(maxPage*limit), ase.objs, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public int psAppDelete(PsApp psApp) {
        AutoSqlEntity ase = psApp.toDelete();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psAppInsert(PsApp psApp) {
        psApp.setPsAppId(DataBase.db.getOnlyIdDistributed());
        AutoSqlEntity ase = psApp.toInsert();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psAppUpdate(PsApp psApp) {
        AutoSqlEntity ase = psApp.toUpdate();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }


    @Override
    public int psAppInsertAsy(PsApp psApp) {
        return psAppInsertAsy(psApp, true);
    }

    @Override
    public int psAppInsertAsy(PsApp psApp, boolean auto) {
        if (auto) {
            psApp.setPsAppId(DataBase.db.getOnlyIdDistributed());
        }
        AutoSqlEntity ase = psApp.toInsert();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAppDeleteAsy(PsApp psApp) {
        AutoSqlEntity ase = psApp.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAppUpdateAsy(PsApp psApp) {
        AutoSqlEntity ase = psApp.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psAppBatch(List<PsApp> list) {
        return psAppBatch(list, true);
    }

    @Override
    public int psAppBatch(List<PsApp> list, boolean autoId) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (autoId) {
                    list.get(i).setPsAppId(DataBase.db.getOnlyIdDistributed());
                }
                AutoSqlEntity ase = list.get(i).toInsert();
                if (i == 0) {
                    sb.append("Batch:").append(ase.sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(ase.sql);
                }
                for (int i1 = 0; i1 < ase.objs.length; i1++) {
                    ps.setObject(i1 + 1, ase.objs[i1]);
                }
                sb.append(DataBase.db.getKey(ase.sql, ase.objs));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public int psAppBatch(String sql, List<Object[]> list) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    sb.append("Batch:").append(sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(sql);
                }
                for (int i1 = 0; i1 < list.get(i).length; i1++) {
                    ps.setObject(i1 + 1, list.get(i)[i1]);
                }
                sb.append(DataBase.db.getKey(sql, list.get(i)));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public PsDev psDevFind(Long ps_dev_id) {
        List<PsDev> list = psDevQuery("select * from "+DataBase.psDevName+" where ps_dev_id=?", Tools.toArray(ps_dev_id));
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsDev psDevFind(String sql, Object[] arr) {
        List<PsDev> list = psDevQuery(sql, arr);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsDev psDevFind(PsDev psDev) {
        AutoSqlEntity ase = psDev.toSelect();
        List<PsDev> list = psDevQuery(ase.sql, ase.objs);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsDev psDevFindCache(PsDev psDev,int mm) {
        AutoSqlEntity ase = psDev.toSelect();
        List<PsDev> list = psDevQueryCache(ase.sql, ase.objs,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    public PsDev psDevFindCache(Long ps_dev_id,int mm) {
        List<PsDev> list = psDevQueryCache("select * from "+DataBase.psDevName+" where ps_dev_id=?", Tools.toArray(ps_dev_id),mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsDev psDevFindCache(String sql, Object[] arr,int mm) {
        List<PsDev> list = psDevQueryCache(sql, arr,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<PsDev> psDevQuery(String sql, Object[] arr) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (arr == null) {
            arr = Tools.toArray();
        }
        List<PsDev> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(";参数:");
        try {
            conn = DataBase.db.getConnection();
            ps = conn.prepareStatement(sql);
            PsDev en;
            String temp = "";
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(",");
                ps.setObject(i + 1, arr[i].toString());
            }
            long t1 = new Date().getTime();
            rs = ps.executeQuery();
            long t2 = new Date().getTime();
            sb.append(";查询耗时:").append(t2 - t1).append("毫秒");
            t1 = new Date().getTime();
            String a = "," + Tools.textMid(sql, "select ", " from", 1).replaceAll(" ", "") + ",";
            while (rs.next()) {
                en = new PsDev();
                if (a.equals(",*,") || a.indexOf(",psDevId,") > -1 || a.indexOf(",ps_dev_id,") > -1) {
                    temp = rs.getString("ps_dev_id");
                    if (temp != null) {
                        en.setPsDevId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevUserId,") > -1 || a.indexOf(",ps_dev_user_id,") > -1) {
                    temp = rs.getString("ps_dev_user_id");
                    if (temp != null) {
                        en.setPsDevUserId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevUserAcc,") > -1 || a.indexOf(",ps_dev_user_acc,") > -1) {
                    temp = rs.getString("ps_dev_user_acc");
                    if (temp != null) {
                        en.setPsDevUserAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevAdminId,") > -1 || a.indexOf(",ps_dev_admin_id,") > -1) {
                    temp = rs.getString("ps_dev_admin_id");
                    if (temp != null) {
                        en.setPsDevAdminId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevAdminAcc,") > -1 || a.indexOf(",ps_dev_admin_acc,") > -1) {
                    temp = rs.getString("ps_dev_admin_acc");
                    if (temp != null) {
                        en.setPsDevAdminAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevAppId,") > -1 || a.indexOf(",ps_dev_app_id,") > -1) {
                    temp = rs.getString("ps_dev_app_id");
                    if (temp != null) {
                        en.setPsDevAppId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevAppName,") > -1 || a.indexOf(",ps_dev_app_name,") > -1) {
                    temp = rs.getString("ps_dev_app_name");
                    if (temp != null) {
                        en.setPsDevAppName(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevName,") > -1 || a.indexOf(",ps_dev_name,") > -1) {
                    temp = rs.getString("ps_dev_name");
                    if (temp != null) {
                        en.setPsDevName(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psDevState,") > -1 || a.indexOf(",ps_dev_state,") > -1) {
                    temp = rs.getString("ps_dev_state");
                    if (temp != null) {
                        en.setPsDevState(java.lang.Integer.valueOf(temp));
                    }
                }
                list.add(en);
            }
            t2 = new Date().getTime();
            sb.append(";组装对象耗时:").append(t2 - t1).append("毫秒");
            Log.sql(sb.toString());
        } catch (Exception e) {
            Log.e(e, sb.toString());
        } finally {
            DataBase.db.close(conn, rs, ps);
        }
        return list;
    }

    @Override
    public List<PsDev> psDevQuery(PsDev psDev) {
        AutoSqlEntity ase = psDev.toSelect();
        return psDevQuery(ase.sql, ase.objs);
    }

    @Override
    public ListPage psDevQuery(String sql, Object[] arr, int page, int limit) {
        ListPage listPage = new ListPage();
        List<PsDev> list = psDevQuery(sql, arr);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psDevQuery(PsDev psDev, int page, int limit, int maxPage, int maxLimit) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page>maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psDev.toSelect();
        List<PsDev> list = psDevQuery(ase.sql + " limit "+(maxPage*limit), ase.objs);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public List<PsDev> psDevQueryCache(String sql, Object[] arr, int mm) {
        List<PsDev> list = new ArrayList<>();
        String key = DataBase.db.getKey(sql, arr);
        String str = Cache.gzbCache.get(key);
        if (str == null) {
            Log.sql("Miss:" + key);
            list = psDevQuery(sql, arr);
            Cache.gzbCache.set(key, list.toString(), mm);
        } else {
            Log.sql("Hit:" + key);
            list = psDevToList(str);
        }
        return list;
    }
    @Override
    public List<PsDev> psDevQueryCache(PsDev psDev, int mm) {
        AutoSqlEntity ase = psDev.toSelect();
        return psDevQueryCache(ase.sql, ase.objs, mm);
    }

    @Override
    public ListPage psDevQueryCache(String sql, Object[] arr, int page, int limit, int mm) {
        ListPage listPage = new ListPage();
        List<PsDev> list = psDevQueryCache(sql, arr, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psDevQueryCache(PsDev psDev, int page, int limit, int maxPage, int maxLimit, int mm) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page > maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psDev.toSelect();
        List<PsDev> list = psDevQueryCache(ase.sql+ " limit "+(maxPage*limit), ase.objs, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public int psDevDelete(PsDev psDev) {
        AutoSqlEntity ase = psDev.toDelete();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psDevInsert(PsDev psDev) {
        psDev.setPsDevId(DataBase.db.getOnlyIdDistributed());
        AutoSqlEntity ase = psDev.toInsert();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psDevUpdate(PsDev psDev) {
        AutoSqlEntity ase = psDev.toUpdate();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }


    @Override
    public int psDevInsertAsy(PsDev psDev) {
        return psDevInsertAsy(psDev, true);
    }

    @Override
    public int psDevInsertAsy(PsDev psDev, boolean auto) {
        if (auto) {
            psDev.setPsDevId(DataBase.db.getOnlyIdDistributed());
        }
        AutoSqlEntity ase = psDev.toInsert();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psDevDeleteAsy(PsDev psDev) {
        AutoSqlEntity ase = psDev.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psDevUpdateAsy(PsDev psDev) {
        AutoSqlEntity ase = psDev.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psDevBatch(List<PsDev> list) {
        return psDevBatch(list, true);
    }

    @Override
    public int psDevBatch(List<PsDev> list, boolean autoId) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (autoId) {
                    list.get(i).setPsDevId(DataBase.db.getOnlyIdDistributed());
                }
                AutoSqlEntity ase = list.get(i).toInsert();
                if (i == 0) {
                    sb.append("Batch:").append(ase.sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(ase.sql);
                }
                for (int i1 = 0; i1 < ase.objs.length; i1++) {
                    ps.setObject(i1 + 1, ase.objs[i1]);
                }
                sb.append(DataBase.db.getKey(ase.sql, ase.objs));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public int psDevBatch(String sql, List<Object[]> list) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    sb.append("Batch:").append(sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(sql);
                }
                for (int i1 = 0; i1 < list.get(i).length; i1++) {
                    ps.setObject(i1 + 1, list.get(i)[i1]);
                }
                sb.append(DataBase.db.getKey(sql, list.get(i)));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public PsOrder psOrderFind(Long ps_order_id) {
        List<PsOrder> list = psOrderQuery("select * from "+DataBase.psOrderName+" where ps_order_id=?", Tools.toArray(ps_order_id));
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsOrder psOrderFind(String sql, Object[] arr) {
        List<PsOrder> list = psOrderQuery(sql, arr);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsOrder psOrderFind(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toSelect();
        List<PsOrder> list = psOrderQuery(ase.sql, ase.objs);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsOrder psOrderFindCache(PsOrder psOrder,int mm) {
        AutoSqlEntity ase = psOrder.toSelect();
        List<PsOrder> list = psOrderQueryCache(ase.sql, ase.objs,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    public PsOrder psOrderFindCache(Long ps_order_id,int mm) {
        List<PsOrder> list = psOrderQueryCache("select * from "+DataBase.psOrderName+" where ps_order_id=?", Tools.toArray(ps_order_id),mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsOrder psOrderFindCache(String sql, Object[] arr,int mm) {
        List<PsOrder> list = psOrderQueryCache(sql, arr,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<PsOrder> psOrderQuery(String sql, Object[] arr) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (arr == null) {
            arr = Tools.toArray();
        }
        List<PsOrder> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(";参数:");
        try {
            conn = DataBase.db.getConnection();
            ps = conn.prepareStatement(sql);
            PsOrder en;
            String temp = "";
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(",");
                ps.setObject(i + 1, arr[i].toString());
            }
            long t1 = new Date().getTime();
            rs = ps.executeQuery();
            long t2 = new Date().getTime();
            sb.append(";查询耗时:").append(t2 - t1).append("毫秒");
            t1 = new Date().getTime();
            String a = "," + Tools.textMid(sql, "select ", " from", 1).replaceAll(" ", "") + ",";
            while (rs.next()) {
                en = new PsOrder();
                if (a.equals(",*,") || a.indexOf(",psOrderId,") > -1 || a.indexOf(",ps_order_id,") > -1) {
                    temp = rs.getString("ps_order_id");
                    if (temp != null) {
                        en.setPsOrderId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderUserId,") > -1 || a.indexOf(",ps_order_user_id,") > -1) {
                    temp = rs.getString("ps_order_user_id");
                    if (temp != null) {
                        en.setPsOrderUserId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderAdminId,") > -1 || a.indexOf(",ps_order_admin_id,") > -1) {
                    temp = rs.getString("ps_order_admin_id");
                    if (temp != null) {
                        en.setPsOrderAdminId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderDevId,") > -1 || a.indexOf(",ps_order_dev_id,") > -1) {
                    temp = rs.getString("ps_order_dev_id");
                    if (temp != null) {
                        en.setPsOrderDevId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderAppId,") > -1 || a.indexOf(",ps_order_app_id,") > -1) {
                    temp = rs.getString("ps_order_app_id");
                    if (temp != null) {
                        en.setPsOrderAppId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderUserAcc,") > -1 || a.indexOf(",ps_order_user_acc,") > -1) {
                    temp = rs.getString("ps_order_user_acc");
                    if (temp != null) {
                        en.setPsOrderUserAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderAdminAcc,") > -1 || a.indexOf(",ps_order_admin_acc,") > -1) {
                    temp = rs.getString("ps_order_admin_acc");
                    if (temp != null) {
                        en.setPsOrderAdminAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderDevName,") > -1 || a.indexOf(",ps_order_dev_name,") > -1) {
                    temp = rs.getString("ps_order_dev_name");
                    if (temp != null) {
                        en.setPsOrderDevName(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderAppName,") > -1 || a.indexOf(",ps_order_app_name,") > -1) {
                    temp = rs.getString("ps_order_app_name");
                    if (temp != null) {
                        en.setPsOrderAppName(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderState,") > -1 || a.indexOf(",ps_order_state,") > -1) {
                    temp = rs.getString("ps_order_state");
                    if (temp != null) {
                        en.setPsOrderState(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderTime,") > -1 || a.indexOf(",ps_order_time,") > -1) {
                    temp = rs.getString("ps_order_time");
                    if (temp != null) {
                        en.setPsOrderTime(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderIp,") > -1 || a.indexOf(",ps_order_ip,") > -1) {
                    temp = rs.getString("ps_order_ip");
                    if (temp != null) {
                        en.setPsOrderIp(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderPayMoney,") > -1 || a.indexOf(",ps_order_pay_money,") > -1) {
                    temp = rs.getString("ps_order_pay_money");
                    if (temp != null) {
                        en.setPsOrderPayMoney(java.lang.Double.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderPayTime,") > -1 || a.indexOf(",ps_order_pay_time,") > -1) {
                    temp = rs.getString("ps_order_pay_time");
                    if (temp != null) {
                        en.setPsOrderPayTime(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderPayType,") > -1 || a.indexOf(",ps_order_pay_type,") > -1) {
                    temp = rs.getString("ps_order_pay_type");
                    if (temp != null) {
                        en.setPsOrderPayType(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderMoney,") > -1 || a.indexOf(",ps_order_money,") > -1) {
                    temp = rs.getString("ps_order_money");
                    if (temp != null) {
                        en.setPsOrderMoney(java.lang.Double.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderDesc,") > -1 || a.indexOf(",ps_order_desc,") > -1) {
                    temp = rs.getString("ps_order_desc");
                    if (temp != null) {
                        en.setPsOrderDesc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderMsg,") > -1 || a.indexOf(",ps_order_msg,") > -1) {
                    temp = rs.getString("ps_order_msg");
                    if (temp != null) {
                        en.setPsOrderMsg(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psOrderType,") > -1 || a.indexOf(",ps_order_type,") > -1) {
                    temp = rs.getString("ps_order_type");
                    if (temp != null) {
                        en.setPsOrderType(java.lang.Integer.valueOf(temp));
                    }
                }
                list.add(en);
            }
            t2 = new Date().getTime();
            sb.append(";组装对象耗时:").append(t2 - t1).append("毫秒");
            Log.sql(sb.toString());
        } catch (Exception e) {
            Log.e(e, sb.toString());
        } finally {
            DataBase.db.close(conn, rs, ps);
        }
        return list;
    }

    @Override
    public List<PsOrder> psOrderQuery(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toSelect();
        return psOrderQuery(ase.sql, ase.objs);
    }

    @Override
    public ListPage psOrderQuery(String sql, Object[] arr, int page, int limit) {
        ListPage listPage = new ListPage();
        List<PsOrder> list = psOrderQuery(sql, arr);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psOrderQuery(PsOrder psOrder, int page, int limit, int maxPage, int maxLimit) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page>maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psOrder.toSelect();
        List<PsOrder> list = psOrderQuery(ase.sql + " limit "+(maxPage*limit), ase.objs);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public List<PsOrder> psOrderQueryCache(String sql, Object[] arr, int mm) {
        List<PsOrder> list = new ArrayList<>();
        String key = DataBase.db.getKey(sql, arr);
        String str = Cache.gzbCache.get(key);
        if (str == null) {
            Log.sql("Miss:" + key);
            list = psOrderQuery(sql, arr);
            Cache.gzbCache.set(key, list.toString(), mm);
        } else {
            Log.sql("Hit:" + key);
            list = psOrderToList(str);
        }
        return list;
    }
    @Override
    public List<PsOrder> psOrderQueryCache(PsOrder psOrder, int mm) {
        AutoSqlEntity ase = psOrder.toSelect();
        return psOrderQueryCache(ase.sql, ase.objs, mm);
    }

    @Override
    public ListPage psOrderQueryCache(String sql, Object[] arr, int page, int limit, int mm) {
        ListPage listPage = new ListPage();
        List<PsOrder> list = psOrderQueryCache(sql, arr, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psOrderQueryCache(PsOrder psOrder, int page, int limit, int maxPage, int maxLimit, int mm) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page > maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psOrder.toSelect();
        List<PsOrder> list = psOrderQueryCache(ase.sql+ " limit "+(maxPage*limit), ase.objs, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public int psOrderDelete(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toDelete();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psOrderInsert(PsOrder psOrder) {
        psOrder.setPsOrderId(DataBase.db.getOnlyIdDistributed());
        AutoSqlEntity ase = psOrder.toInsert();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psOrderUpdate(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toUpdate();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }


    @Override
    public int psOrderInsertAsy(PsOrder psOrder) {
        return psOrderInsertAsy(psOrder, true);
    }

    @Override
    public int psOrderInsertAsy(PsOrder psOrder, boolean auto) {
        if (auto) {
            psOrder.setPsOrderId(DataBase.db.getOnlyIdDistributed());
        }
        AutoSqlEntity ase = psOrder.toInsert();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psOrderDeleteAsy(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psOrderUpdateAsy(PsOrder psOrder) {
        AutoSqlEntity ase = psOrder.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psOrderBatch(List<PsOrder> list) {
        return psOrderBatch(list, true);
    }

    @Override
    public int psOrderBatch(List<PsOrder> list, boolean autoId) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (autoId) {
                    list.get(i).setPsOrderId(DataBase.db.getOnlyIdDistributed());
                }
                AutoSqlEntity ase = list.get(i).toInsert();
                if (i == 0) {
                    sb.append("Batch:").append(ase.sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(ase.sql);
                }
                for (int i1 = 0; i1 < ase.objs.length; i1++) {
                    ps.setObject(i1 + 1, ase.objs[i1]);
                }
                sb.append(DataBase.db.getKey(ase.sql, ase.objs));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public int psOrderBatch(String sql, List<Object[]> list) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    sb.append("Batch:").append(sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(sql);
                }
                for (int i1 = 0; i1 < list.get(i).length; i1++) {
                    ps.setObject(i1 + 1, list.get(i)[i1]);
                }
                sb.append(DataBase.db.getKey(sql, list.get(i)));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    @Override
    public PsUser psUserFind(Long ps_user_id) {
        List<PsUser> list = psUserQuery("select * from "+DataBase.psUserName+" where ps_user_id=?", Tools.toArray(ps_user_id));
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsUser psUserFind(String sql, Object[] arr) {
        List<PsUser> list = psUserQuery(sql, arr);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsUser psUserFind(PsUser psUser) {
        AutoSqlEntity ase = psUser.toSelect();
        List<PsUser> list = psUserQuery(ase.sql, ase.objs);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsUser psUserFindCache(PsUser psUser,int mm) {
        AutoSqlEntity ase = psUser.toSelect();
        List<PsUser> list = psUserQueryCache(ase.sql, ase.objs,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    public PsUser psUserFindCache(Long ps_user_id,int mm) {
        List<PsUser> list = psUserQueryCache("select * from "+DataBase.psUserName+" where ps_user_id=?", Tools.toArray(ps_user_id),mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public PsUser psUserFindCache(String sql, Object[] arr,int mm) {
        List<PsUser> list = psUserQueryCache(sql, arr,mm);
        if (list.size() != 1) {
            return null;
        }
        return list.get(0);
    }
    @Override
    public List<PsUser> psUserQuery(String sql, Object[] arr) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        if (arr == null) {
            arr = Tools.toArray();
        }
        List<PsUser> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append(sql).append(";参数:");
        try {
            conn = DataBase.db.getConnection();
            ps = conn.prepareStatement(sql);
            PsUser en;
            String temp = "";
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(",");
                ps.setObject(i + 1, arr[i].toString());
            }
            long t1 = new Date().getTime();
            rs = ps.executeQuery();
            long t2 = new Date().getTime();
            sb.append(";查询耗时:").append(t2 - t1).append("毫秒");
            t1 = new Date().getTime();
            String a = "," + Tools.textMid(sql, "select ", " from", 1).replaceAll(" ", "") + ",";
            while (rs.next()) {
                en = new PsUser();
                if (a.equals(",*,") || a.indexOf(",psUserId,") > -1 || a.indexOf(",ps_user_id,") > -1) {
                    temp = rs.getString("ps_user_id");
                    if (temp != null) {
                        en.setPsUserId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserAcc,") > -1 || a.indexOf(",ps_user_acc,") > -1) {
                    temp = rs.getString("ps_user_acc");
                    if (temp != null) {
                        en.setPsUserAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserPwd,") > -1 || a.indexOf(",ps_user_pwd,") > -1) {
                    temp = rs.getString("ps_user_pwd");
                    if (temp != null) {
                        en.setPsUserPwd(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserPhone,") > -1 || a.indexOf(",ps_user_phone,") > -1) {
                    temp = rs.getString("ps_user_phone");
                    if (temp != null) {
                        en.setPsUserPhone(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserEm,") > -1 || a.indexOf(",ps_user_em,") > -1) {
                    temp = rs.getString("ps_user_em");
                    if (temp != null) {
                        en.setPsUserEm(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserState,") > -1 || a.indexOf(",ps_user_state,") > -1) {
                    temp = rs.getString("ps_user_state");
                    if (temp != null) {
                        en.setPsUserState(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserMaxAppNum,") > -1 || a.indexOf(",ps_user_max_app_num,") > -1) {
                    temp = rs.getString("ps_user_max_app_num");
                    if (temp != null) {
                        en.setPsUserMaxAppNum(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserThisAppNum,") > -1 || a.indexOf(",ps_user_this_app_num,") > -1) {
                    temp = rs.getString("ps_user_this_app_num");
                    if (temp != null) {
                        en.setPsUserThisAppNum(java.lang.Integer.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserAdminId,") > -1 || a.indexOf(",ps_user_admin_id,") > -1) {
                    temp = rs.getString("ps_user_admin_id");
                    if (temp != null) {
                        en.setPsUserAdminId(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserAdminAcc,") > -1 || a.indexOf(",ps_user_admin_acc,") > -1) {
                    temp = rs.getString("ps_user_admin_acc");
                    if (temp != null) {
                        en.setPsUserAdminAcc(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserSup,") > -1 || a.indexOf(",ps_user_sup,") > -1) {
                    temp = rs.getString("ps_user_sup");
                    if (temp != null) {
                        en.setPsUserSup(java.lang.Long.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserRegTime,") > -1 || a.indexOf(",ps_user_reg_time,") > -1) {
                    temp = rs.getString("ps_user_reg_time");
                    if (temp != null) {
                        en.setPsUserRegTime(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserRegIp,") > -1 || a.indexOf(",ps_user_reg_ip,") > -1) {
                    temp = rs.getString("ps_user_reg_ip");
                    if (temp != null) {
                        en.setPsUserRegIp(java.lang.String.valueOf(temp));
                    }
                }
                if (a.equals(",*,") || a.indexOf(",psUserLoginTime,") > -1 || a.indexOf(",ps_user_login_time,") > -1) {
                    temp = rs.getString("ps_user_login_time");
                    if (temp != null) {
                        en.setPsUserLoginTime(java.lang.String.valueOf(temp));
                    }
                }
                list.add(en);
            }
            t2 = new Date().getTime();
            sb.append(";组装对象耗时:").append(t2 - t1).append("毫秒");
            Log.sql(sb.toString());
        } catch (Exception e) {
            Log.e(e, sb.toString());
        } finally {
            DataBase.db.close(conn, rs, ps);
        }
        return list;
    }

    @Override
    public List<PsUser> psUserQuery(PsUser psUser) {
        AutoSqlEntity ase = psUser.toSelect();
        return psUserQuery(ase.sql, ase.objs);
    }

    @Override
    public ListPage psUserQuery(String sql, Object[] arr, int page, int limit) {
        ListPage listPage = new ListPage();
        List<PsUser> list = psUserQuery(sql, arr);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psUserQuery(PsUser psUser, int page, int limit, int maxPage, int maxLimit) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page>maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psUser.toSelect();
        List<PsUser> list = psUserQuery(ase.sql + " limit "+(maxPage*limit), ase.objs);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public List<PsUser> psUserQueryCache(String sql, Object[] arr, int mm) {
        List<PsUser> list = new ArrayList<>();
        String key = DataBase.db.getKey(sql, arr);
        String str = Cache.gzbCache.get(key);
        if (str == null) {
            Log.sql("Miss:" + key);
            list = psUserQuery(sql, arr);
            Cache.gzbCache.set(key, list.toString(), mm);
        } else {
            Log.sql("Hit:" + key);
            list = psUserToList(str);
        }
        return list;
    }
    @Override
    public List<PsUser> psUserQueryCache(PsUser psUser, int mm) {
        AutoSqlEntity ase = psUser.toSelect();
        return psUserQueryCache(ase.sql, ase.objs, mm);
    }

    @Override
    public ListPage psUserQueryCache(String sql, Object[] arr, int page, int limit, int mm) {
        ListPage listPage = new ListPage();
        List<PsUser> list = psUserQueryCache(sql, arr, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public ListPage psUserQueryCache(PsUser psUser, int page, int limit, int maxPage, int maxLimit, int mm) {
        limit=limit>maxLimit ? maxLimit : limit;
        page=page > maxPage ? maxPage : page;
        ListPage listPage = new ListPage();
        AutoSqlEntity ase = psUser.toSelect();
        List<PsUser> list = psUserQueryCache(ase.sql+ " limit "+(maxPage*limit), ase.objs, mm);
        listPage.limitList(list, page, limit);
        return listPage;
    }

    @Override
    public int psUserDelete(PsUser psUser) {
        AutoSqlEntity ase = psUser.toDelete();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psUserInsert(PsUser psUser) {
        psUser.setPsUserId(DataBase.db.getOnlyIdDistributed());
        AutoSqlEntity ase = psUser.toInsert();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }

    @Override
    public int psUserUpdate(PsUser psUser) {
        AutoSqlEntity ase = psUser.toUpdate();
        return DataBase.db.runSqlUpdateOrSaveOrDelete(ase.sql, ase.objs);
    }


    @Override
    public int psUserInsertAsy(PsUser psUser) {
        return psUserInsertAsy(psUser, true);
    }

    @Override
    public int psUserInsertAsy(PsUser psUser, boolean auto) {
        if (auto) {
            psUser.setPsUserId(DataBase.db.getOnlyIdDistributed());
        }
        AutoSqlEntity ase = psUser.toInsert();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psUserDeleteAsy(PsUser psUser) {
        AutoSqlEntity ase = psUser.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psUserUpdateAsy(PsUser psUser) {
        AutoSqlEntity ase = psUser.toUpdate();
        return DataBase.addAsyInfo(ase.sql, ase.objs);
    }

    @Override
    public int psUserBatch(List<PsUser> list) {
        return psUserBatch(list, true);
    }

    @Override
    public int psUserBatch(List<PsUser> list, boolean autoId) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (autoId) {
                    list.get(i).setPsUserId(DataBase.db.getOnlyIdDistributed());
                }
                AutoSqlEntity ase = list.get(i).toInsert();
                if (i == 0) {
                    sb.append("Batch:").append(ase.sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(ase.sql);
                }
                for (int i1 = 0; i1 < ase.objs.length; i1++) {
                    ps.setObject(i1 + 1, ase.objs[i1]);
                }
                sb.append(DataBase.db.getKey(ase.sql, ase.objs));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public int psUserBatch(String sql, List<Object[]> list) {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        StringBuilder sb = new StringBuilder();
        try {
            long t1 = new Date().getTime();
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    sb.append("Batch:").append(sql).append(";参数:");
                    conn = DataBase.db.getConnection();
                    conn.setAutoCommit(false);
                    ps = conn.prepareStatement(sql);
                }
                for (int i1 = 0; i1 < list.get(i).length; i1++) {
                    ps.setObject(i1 + 1, list.get(i)[i1]);
                }
                sb.append(DataBase.db.getKey(sql, list.get(i)));
                ps.addBatch();
            }
            long t2 = new Date().getTime();
            sb.append(";组装耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            t1 = new Date().getTime();
            int[] res = ps.executeBatch();
            conn.commit();
            t2 = new Date().getTime();
            sb.append(";执行耗时:");
            sb.append(t2 - t1);
            sb.append("毫秒");
            Log.sql(sb.toString());
            return res.length;
        } catch (SQLIntegrityConstraintViolationException e) {
            Log.e(e, "ID冲突" + sb.toString());
            return -1;
        } catch (Exception e) {
            Log.e(e, sb.toString());
            return -1;
        } finally {
            try {
                conn.setAutoCommit(true);
                DataBase.db.close(conn, rs, ps);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}