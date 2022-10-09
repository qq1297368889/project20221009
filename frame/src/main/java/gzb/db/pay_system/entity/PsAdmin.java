package gzb.db.pay_system.entity;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.dao.BaseDao;
import gzb.tools.Tools;
import gzb.tools.ListPage;
import gzb.tools.entity.AutoSqlEntity;
import java.util.ArrayList;
import java.util.List;
public class PsAdmin {
    private java.lang.Long psAdminId;
    private java.lang.String psAdminAcc;
    private java.lang.String psAdminPwd;
    private java.lang.Integer psAdminState;
    private java.lang.String psAdminIdOperation="=";
    private java.lang.String psAdminAccOperation="=";
    private java.lang.String psAdminPwdOperation="=";
    private java.lang.String psAdminStateOperation="=";
    private java.util.List<?>list;
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }
    public PsAdmin() {
    }
    public PsAdmin(String json) {
        String tmp;
        tmp = Tools.textMid(json, "\"psAdminId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAdminIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAdminAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAdminAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAdminPwd\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminPwd = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAdminPwdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminPwdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psAdminState\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminState = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psAdminStateOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psAdminStateOperation = tmp;}
    }
    @Override
    public String toString() {
        return toJson();
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (psAdminId != null){sb.append("\"psAdminId\":\"").append(psAdminId).append("\",");}
        if (psAdminAcc != null){sb.append("\"psAdminAcc\":\"").append(psAdminAcc).append("\",");}
        if (psAdminPwd != null){sb.append("\"psAdminPwd\":\"").append(psAdminPwd).append("\",");}
        if (psAdminState != null){sb.append("\"psAdminState\":\"").append(psAdminState).append("\"");}
        if (list != null){sb.append(",\"data\":").append(list.toString()).append(",");}
        if (sb.substring(sb.length()-1,sb.length()).equals(","))sb.delete(sb.length()-1,sb.length()).equals(",");
        sb.append("}");
        return sb.toString();
    }
    public java.lang.Long getPsAdminId() {
        return this.psAdminId;
    }
    public PsAdmin setPsAdminId(java.lang.Long psAdminId) {
        this.psAdminId = psAdminId;
        return this;
    }
    public PsAdmin setPsAdminId(java.lang.Long psAdminId,java.lang.String psAdminIdOperation) {
        this.psAdminId = psAdminId;
        this.psAdminIdOperation = psAdminIdOperation;
        return this;
    }
    public java.lang.String getPsAdminAcc() {
        return this.psAdminAcc;
    }
    public PsAdmin setPsAdminAcc(java.lang.String psAdminAcc) {
        this.psAdminAcc = psAdminAcc;
        return this;
    }
    public PsAdmin setPsAdminAcc(java.lang.String psAdminAcc,java.lang.String psAdminAccOperation) {
        this.psAdminAcc = psAdminAcc;
        this.psAdminAccOperation = psAdminAccOperation;
        return this;
    }
    public java.lang.String getPsAdminPwd() {
        return this.psAdminPwd;
    }
    public PsAdmin setPsAdminPwd(java.lang.String psAdminPwd) {
        this.psAdminPwd = psAdminPwd;
        return this;
    }
    public PsAdmin setPsAdminPwd(java.lang.String psAdminPwd,java.lang.String psAdminPwdOperation) {
        this.psAdminPwd = psAdminPwd;
        this.psAdminPwdOperation = psAdminPwdOperation;
        return this;
    }
    public java.lang.Integer getPsAdminState() {
        return this.psAdminState;
    }
    public PsAdmin setPsAdminState(java.lang.Integer psAdminState) {
        this.psAdminState = psAdminState;
        return this;
    }
    public PsAdmin setPsAdminState(java.lang.Integer psAdminState,java.lang.String psAdminStateOperation) {
        this.psAdminState = psAdminState;
        this.psAdminStateOperation = psAdminStateOperation;
        return this;
    }
    public AutoSqlEntity toWhere(String sql){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(sql+" where ");
        if (this.psAdminId !=null){sb.append("ps_admin_id ").append(psAdminIdOperation).append(" ? and ");list.add(this.psAdminId);}
        if (this.psAdminAcc !=null){sb.append("ps_admin_acc ").append(psAdminAccOperation).append(" ? and ");list.add(this.psAdminAcc);}
        if (this.psAdminPwd !=null){sb.append("ps_admin_pwd ").append(psAdminPwdOperation).append(" ? and ");list.add(this.psAdminPwd);}
        if (this.psAdminState !=null){sb.append("ps_admin_state ").append(psAdminStateOperation).append(" ? and ");list.add(this.psAdminState);}
        if (sb.substring(sb.length()-5,sb.length()).equals(" and "))sb.delete(sb.length()-5,sb.length());
        if (sb.substring(sb.length()-6,sb.length()).equals("where "))sb.delete(sb.length()-6,sb.length());
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toSelect(){
        return toWhere("select * from "+DataBase.psAdminName);
    }
    public AutoSqlEntity toDelete(){
        return toWhere("delete from "+DataBase.psAdminName);
    }
    public AutoSqlEntity toUpdate(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("update "+DataBase.psAdminName+" set ");
        if (this.psAdminId !=null){sb.append("ps_admin_id=?, ");list.add(this.psAdminId);}
        if (this.psAdminAcc !=null){sb.append("ps_admin_acc=?, ");list.add(this.psAdminAcc);}
        if (this.psAdminPwd !=null){sb.append("ps_admin_pwd=?, ");list.add(this.psAdminPwd);}
        if (this.psAdminState !=null){sb.append("ps_admin_state=?, ");list.add(this.psAdminState);}
        if (sb.substring(sb.length()-2,sb.length()).equals(", "))sb.delete(sb.length()-2,sb.length()-1);
        if (sb.substring(sb.length()-4,sb.length()).equals("set "))sb.delete(sb.length()-4,sb.length());
        sb.append("where ps_admin_id=?");list.add(this.psAdminId);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toInsert(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("insert into "+DataBase.psAdminName+"(ps_admin_id,ps_admin_acc,ps_admin_pwd,ps_admin_state) values(?,?,?,?)");
        list.add(this.psAdminId);
        list.add(this.psAdminAcc);
        list.add(this.psAdminPwd);
        list.add(this.psAdminState);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public PsAdmin find(BaseDao dao) {
        return dao.psAdminFind(this);
    }

    public PsAdmin findCache(BaseDao dao, int mm) {
        return dao.psAdminFindCache(this, mm);
    }

    public List<PsAdmin> query(BaseDao dao) {
        return dao.psAdminQuery(this);
    }

    public List<PsAdmin> queryCache(BaseDao dao, int mm) {
        return dao.psAdminQueryCache(this, mm);
    }

    public ListPage query(BaseDao dao, int page, int limit, int maxPage, int maxLimit) {
        return dao.psAdminQuery(this, page, limit, maxPage, maxLimit);
    }

    public ListPage queryCache(BaseDao dao, int page, int limit, int maxPage, int maxLimit, int mm) {
        return dao.psAdminQueryCache(this, page, limit, maxPage, maxLimit, mm);
    }

    public int save(BaseDao dao) {
        return dao.psAdminInsert(this);
    }

    public int update(BaseDao dao) {
        return dao.psAdminUpdate(this);
    }

    public int delete(BaseDao dao) {
        return dao.psAdminDelete(this);
    }

    public int saveAsy(BaseDao dao) {
        return dao.psAdminInsertAsy(this);
    }

    public int updateAsy(BaseDao dao) {
        return dao.psAdminUpdateAsy(this);
    }

    public int deleteAsy(BaseDao dao) {
        return dao.psAdminDeleteAsy(this);
    }
}