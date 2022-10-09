package gzb.db.pay_system.entity;
import gzb.db.pay_system.DataBase;
import gzb.db.pay_system.dao.BaseDao;
import gzb.tools.Tools;
import gzb.tools.ListPage;
import gzb.tools.entity.AutoSqlEntity;
import java.util.ArrayList;
import java.util.List;
public class PsOrder {
    private java.lang.Long psOrderId;
    private java.lang.Long psOrderUserId;
    private java.lang.Long psOrderAdminId;
    private java.lang.Long psOrderDevId;
    private java.lang.Long psOrderAppId;
    private java.lang.String psOrderUserAcc;
    private java.lang.String psOrderAdminAcc;
    private java.lang.String psOrderDevName;
    private java.lang.String psOrderAppName;
    private java.lang.Integer psOrderState;
    private java.lang.String psOrderTime;
    private java.lang.String psOrderIp;
    private java.lang.Double psOrderPayMoney;
    private java.lang.String psOrderPayTime;
    private java.lang.Integer psOrderPayType;
    private java.lang.Double psOrderMoney;
    private java.lang.String psOrderDesc;
    private java.lang.String psOrderMsg;
    private java.lang.Integer psOrderType;
    private java.lang.String psOrderIdOperation="=";
    private java.lang.String psOrderUserIdOperation="=";
    private java.lang.String psOrderAdminIdOperation="=";
    private java.lang.String psOrderDevIdOperation="=";
    private java.lang.String psOrderAppIdOperation="=";
    private java.lang.String psOrderUserAccOperation="=";
    private java.lang.String psOrderAdminAccOperation="=";
    private java.lang.String psOrderDevNameOperation="=";
    private java.lang.String psOrderAppNameOperation="=";
    private java.lang.String psOrderStateOperation="=";
    private java.lang.String psOrderTimeOperation="=";
    private java.lang.String psOrderIpOperation="=";
    private java.lang.String psOrderPayMoneyOperation="=";
    private java.lang.String psOrderPayTimeOperation="=";
    private java.lang.String psOrderPayTypeOperation="=";
    private java.lang.String psOrderMoneyOperation="=";
    private java.lang.String psOrderDescOperation="=";
    private java.lang.String psOrderMsgOperation="=";
    private java.lang.String psOrderTypeOperation="=";
    private java.util.List<?>list;
    public List<?> getList() {
        return list;
    }
    public void setList(List<?> list) {
        this.list = list;
    }
    public PsOrder() {
    }
    public PsOrder(String json) {
        String tmp;
        tmp = Tools.textMid(json, "\"psOrderId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderUserId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderUserId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderUserIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderUserIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderAdminId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAdminId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderAdminIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAdminIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderDevId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDevId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderDevIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDevIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderAppId\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAppId = java.lang.Long.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderAppIdOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAppIdOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderUserAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderUserAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderUserAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderUserAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderAdminAcc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAdminAcc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderAdminAccOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAdminAccOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderDevName\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDevName = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderDevNameOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDevNameOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderAppName\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAppName = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderAppNameOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderAppNameOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderState\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderState = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderStateOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderStateOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderTime\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderTime = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderTimeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderTimeOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderIp\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderIp = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderIpOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderIpOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderPayMoney\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayMoney = java.lang.Double.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderPayMoneyOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayMoneyOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderPayTime\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayTime = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderPayTimeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayTimeOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderPayType\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayType = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderPayTypeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderPayTypeOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderMoney\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderMoney = java.lang.Double.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderMoneyOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderMoneyOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderDesc\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDesc = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderDescOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderDescOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderMsg\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderMsg = java.lang.String.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderMsgOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderMsgOperation = tmp;}
        tmp = Tools.textMid(json, "\"psOrderType\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderType = java.lang.Integer.valueOf(tmp);}
        tmp = Tools.textMid(json, "\"psOrderTypeOperation\":\"", "\"", 1);
        if (tmp != null && tmp.length() > 0){this.psOrderTypeOperation = tmp;}
    }
    @Override
    public String toString() {
        return toJson();
    }
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (psOrderId != null){sb.append("\"psOrderId\":\"").append(psOrderId).append("\",");}
        if (psOrderUserId != null){sb.append("\"psOrderUserId\":\"").append(psOrderUserId).append("\",");}
        if (psOrderAdminId != null){sb.append("\"psOrderAdminId\":\"").append(psOrderAdminId).append("\",");}
        if (psOrderDevId != null){sb.append("\"psOrderDevId\":\"").append(psOrderDevId).append("\",");}
        if (psOrderAppId != null){sb.append("\"psOrderAppId\":\"").append(psOrderAppId).append("\",");}
        if (psOrderUserAcc != null){sb.append("\"psOrderUserAcc\":\"").append(psOrderUserAcc).append("\",");}
        if (psOrderAdminAcc != null){sb.append("\"psOrderAdminAcc\":\"").append(psOrderAdminAcc).append("\",");}
        if (psOrderDevName != null){sb.append("\"psOrderDevName\":\"").append(psOrderDevName).append("\",");}
        if (psOrderAppName != null){sb.append("\"psOrderAppName\":\"").append(psOrderAppName).append("\",");}
        if (psOrderState != null){sb.append("\"psOrderState\":\"").append(psOrderState).append("\",");}
        if (psOrderTime != null){sb.append("\"psOrderTime\":\"").append(psOrderTime).append("\",");}
        if (psOrderIp != null){sb.append("\"psOrderIp\":\"").append(psOrderIp).append("\",");}
        if (psOrderPayMoney != null){sb.append("\"psOrderPayMoney\":\"").append(psOrderPayMoney).append("\",");}
        if (psOrderPayTime != null){sb.append("\"psOrderPayTime\":\"").append(psOrderPayTime).append("\",");}
        if (psOrderPayType != null){sb.append("\"psOrderPayType\":\"").append(psOrderPayType).append("\",");}
        if (psOrderMoney != null){sb.append("\"psOrderMoney\":\"").append(psOrderMoney).append("\",");}
        if (psOrderDesc != null){sb.append("\"psOrderDesc\":\"").append(psOrderDesc).append("\",");}
        if (psOrderMsg != null){sb.append("\"psOrderMsg\":\"").append(psOrderMsg).append("\",");}
        if (psOrderType != null){sb.append("\"psOrderType\":\"").append(psOrderType).append("\"");}
        if (list != null){sb.append(",\"data\":").append(list.toString()).append(",");}
        if (sb.substring(sb.length()-1,sb.length()).equals(","))sb.delete(sb.length()-1,sb.length()).equals(",");
        sb.append("}");
        return sb.toString();
    }
    public java.lang.Long getPsOrderId() {
        return this.psOrderId;
    }
    public PsOrder setPsOrderId(java.lang.Long psOrderId) {
        this.psOrderId = psOrderId;
        return this;
    }
    public PsOrder setPsOrderId(java.lang.Long psOrderId,java.lang.String psOrderIdOperation) {
        this.psOrderId = psOrderId;
        this.psOrderIdOperation = psOrderIdOperation;
        return this;
    }
    public java.lang.Long getPsOrderUserId() {
        return this.psOrderUserId;
    }
    public PsOrder setPsOrderUserId(java.lang.Long psOrderUserId) {
        this.psOrderUserId = psOrderUserId;
        return this;
    }
    public PsOrder setPsOrderUserId(java.lang.Long psOrderUserId,java.lang.String psOrderUserIdOperation) {
        this.psOrderUserId = psOrderUserId;
        this.psOrderUserIdOperation = psOrderUserIdOperation;
        return this;
    }
    public java.lang.Long getPsOrderAdminId() {
        return this.psOrderAdminId;
    }
    public PsOrder setPsOrderAdminId(java.lang.Long psOrderAdminId) {
        this.psOrderAdminId = psOrderAdminId;
        return this;
    }
    public PsOrder setPsOrderAdminId(java.lang.Long psOrderAdminId,java.lang.String psOrderAdminIdOperation) {
        this.psOrderAdminId = psOrderAdminId;
        this.psOrderAdminIdOperation = psOrderAdminIdOperation;
        return this;
    }
    public java.lang.Long getPsOrderDevId() {
        return this.psOrderDevId;
    }
    public PsOrder setPsOrderDevId(java.lang.Long psOrderDevId) {
        this.psOrderDevId = psOrderDevId;
        return this;
    }
    public PsOrder setPsOrderDevId(java.lang.Long psOrderDevId,java.lang.String psOrderDevIdOperation) {
        this.psOrderDevId = psOrderDevId;
        this.psOrderDevIdOperation = psOrderDevIdOperation;
        return this;
    }
    public java.lang.Long getPsOrderAppId() {
        return this.psOrderAppId;
    }
    public PsOrder setPsOrderAppId(java.lang.Long psOrderAppId) {
        this.psOrderAppId = psOrderAppId;
        return this;
    }
    public PsOrder setPsOrderAppId(java.lang.Long psOrderAppId,java.lang.String psOrderAppIdOperation) {
        this.psOrderAppId = psOrderAppId;
        this.psOrderAppIdOperation = psOrderAppIdOperation;
        return this;
    }
    public java.lang.String getPsOrderUserAcc() {
        return this.psOrderUserAcc;
    }
    public PsOrder setPsOrderUserAcc(java.lang.String psOrderUserAcc) {
        this.psOrderUserAcc = psOrderUserAcc;
        return this;
    }
    public PsOrder setPsOrderUserAcc(java.lang.String psOrderUserAcc,java.lang.String psOrderUserAccOperation) {
        this.psOrderUserAcc = psOrderUserAcc;
        this.psOrderUserAccOperation = psOrderUserAccOperation;
        return this;
    }
    public java.lang.String getPsOrderAdminAcc() {
        return this.psOrderAdminAcc;
    }
    public PsOrder setPsOrderAdminAcc(java.lang.String psOrderAdminAcc) {
        this.psOrderAdminAcc = psOrderAdminAcc;
        return this;
    }
    public PsOrder setPsOrderAdminAcc(java.lang.String psOrderAdminAcc,java.lang.String psOrderAdminAccOperation) {
        this.psOrderAdminAcc = psOrderAdminAcc;
        this.psOrderAdminAccOperation = psOrderAdminAccOperation;
        return this;
    }
    public java.lang.String getPsOrderDevName() {
        return this.psOrderDevName;
    }
    public PsOrder setPsOrderDevName(java.lang.String psOrderDevName) {
        this.psOrderDevName = psOrderDevName;
        return this;
    }
    public PsOrder setPsOrderDevName(java.lang.String psOrderDevName,java.lang.String psOrderDevNameOperation) {
        this.psOrderDevName = psOrderDevName;
        this.psOrderDevNameOperation = psOrderDevNameOperation;
        return this;
    }
    public java.lang.String getPsOrderAppName() {
        return this.psOrderAppName;
    }
    public PsOrder setPsOrderAppName(java.lang.String psOrderAppName) {
        this.psOrderAppName = psOrderAppName;
        return this;
    }
    public PsOrder setPsOrderAppName(java.lang.String psOrderAppName,java.lang.String psOrderAppNameOperation) {
        this.psOrderAppName = psOrderAppName;
        this.psOrderAppNameOperation = psOrderAppNameOperation;
        return this;
    }
    public java.lang.Integer getPsOrderState() {
        return this.psOrderState;
    }
    public PsOrder setPsOrderState(java.lang.Integer psOrderState) {
        this.psOrderState = psOrderState;
        return this;
    }
    public PsOrder setPsOrderState(java.lang.Integer psOrderState,java.lang.String psOrderStateOperation) {
        this.psOrderState = psOrderState;
        this.psOrderStateOperation = psOrderStateOperation;
        return this;
    }
    public java.lang.String getPsOrderTime() {
        return this.psOrderTime;
    }
    public PsOrder setPsOrderTime(java.lang.String psOrderTime) {
        this.psOrderTime = psOrderTime;
        return this;
    }
    public PsOrder setPsOrderTime(java.lang.String psOrderTime,java.lang.String psOrderTimeOperation) {
        this.psOrderTime = psOrderTime;
        this.psOrderTimeOperation = psOrderTimeOperation;
        return this;
    }
    public java.lang.String getPsOrderIp() {
        return this.psOrderIp;
    }
    public PsOrder setPsOrderIp(java.lang.String psOrderIp) {
        this.psOrderIp = psOrderIp;
        return this;
    }
    public PsOrder setPsOrderIp(java.lang.String psOrderIp,java.lang.String psOrderIpOperation) {
        this.psOrderIp = psOrderIp;
        this.psOrderIpOperation = psOrderIpOperation;
        return this;
    }
    public java.lang.Double getPsOrderPayMoney() {
        return this.psOrderPayMoney;
    }
    public PsOrder setPsOrderPayMoney(java.lang.Double psOrderPayMoney) {
        this.psOrderPayMoney = psOrderPayMoney;
        return this;
    }
    public PsOrder setPsOrderPayMoney(java.lang.Double psOrderPayMoney,java.lang.String psOrderPayMoneyOperation) {
        this.psOrderPayMoney = psOrderPayMoney;
        this.psOrderPayMoneyOperation = psOrderPayMoneyOperation;
        return this;
    }
    public java.lang.String getPsOrderPayTime() {
        return this.psOrderPayTime;
    }
    public PsOrder setPsOrderPayTime(java.lang.String psOrderPayTime) {
        this.psOrderPayTime = psOrderPayTime;
        return this;
    }
    public PsOrder setPsOrderPayTime(java.lang.String psOrderPayTime,java.lang.String psOrderPayTimeOperation) {
        this.psOrderPayTime = psOrderPayTime;
        this.psOrderPayTimeOperation = psOrderPayTimeOperation;
        return this;
    }
    public java.lang.Integer getPsOrderPayType() {
        return this.psOrderPayType;
    }
    public PsOrder setPsOrderPayType(java.lang.Integer psOrderPayType) {
        this.psOrderPayType = psOrderPayType;
        return this;
    }
    public PsOrder setPsOrderPayType(java.lang.Integer psOrderPayType,java.lang.String psOrderPayTypeOperation) {
        this.psOrderPayType = psOrderPayType;
        this.psOrderPayTypeOperation = psOrderPayTypeOperation;
        return this;
    }
    public java.lang.Double getPsOrderMoney() {
        return this.psOrderMoney;
    }
    public PsOrder setPsOrderMoney(java.lang.Double psOrderMoney) {
        this.psOrderMoney = psOrderMoney;
        return this;
    }
    public PsOrder setPsOrderMoney(java.lang.Double psOrderMoney,java.lang.String psOrderMoneyOperation) {
        this.psOrderMoney = psOrderMoney;
        this.psOrderMoneyOperation = psOrderMoneyOperation;
        return this;
    }
    public java.lang.String getPsOrderDesc() {
        return this.psOrderDesc;
    }
    public PsOrder setPsOrderDesc(java.lang.String psOrderDesc) {
        this.psOrderDesc = psOrderDesc;
        return this;
    }
    public PsOrder setPsOrderDesc(java.lang.String psOrderDesc,java.lang.String psOrderDescOperation) {
        this.psOrderDesc = psOrderDesc;
        this.psOrderDescOperation = psOrderDescOperation;
        return this;
    }
    public java.lang.String getPsOrderMsg() {
        return this.psOrderMsg;
    }
    public PsOrder setPsOrderMsg(java.lang.String psOrderMsg) {
        this.psOrderMsg = psOrderMsg;
        return this;
    }
    public PsOrder setPsOrderMsg(java.lang.String psOrderMsg,java.lang.String psOrderMsgOperation) {
        this.psOrderMsg = psOrderMsg;
        this.psOrderMsgOperation = psOrderMsgOperation;
        return this;
    }
    public java.lang.Integer getPsOrderType() {
        return this.psOrderType;
    }
    public PsOrder setPsOrderType(java.lang.Integer psOrderType) {
        this.psOrderType = psOrderType;
        return this;
    }
    public PsOrder setPsOrderType(java.lang.Integer psOrderType,java.lang.String psOrderTypeOperation) {
        this.psOrderType = psOrderType;
        this.psOrderTypeOperation = psOrderTypeOperation;
        return this;
    }
    public AutoSqlEntity toWhere(String sql){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append(sql+" where ");
        if (this.psOrderId !=null){sb.append("ps_order_id ").append(psOrderIdOperation).append(" ? and ");list.add(this.psOrderId);}
        if (this.psOrderUserId !=null){sb.append("ps_order_user_id ").append(psOrderUserIdOperation).append(" ? and ");list.add(this.psOrderUserId);}
        if (this.psOrderAdminId !=null){sb.append("ps_order_admin_id ").append(psOrderAdminIdOperation).append(" ? and ");list.add(this.psOrderAdminId);}
        if (this.psOrderDevId !=null){sb.append("ps_order_dev_id ").append(psOrderDevIdOperation).append(" ? and ");list.add(this.psOrderDevId);}
        if (this.psOrderAppId !=null){sb.append("ps_order_app_id ").append(psOrderAppIdOperation).append(" ? and ");list.add(this.psOrderAppId);}
        if (this.psOrderUserAcc !=null){sb.append("ps_order_user_acc ").append(psOrderUserAccOperation).append(" ? and ");list.add(this.psOrderUserAcc);}
        if (this.psOrderAdminAcc !=null){sb.append("ps_order_admin_acc ").append(psOrderAdminAccOperation).append(" ? and ");list.add(this.psOrderAdminAcc);}
        if (this.psOrderDevName !=null){sb.append("ps_order_dev_name ").append(psOrderDevNameOperation).append(" ? and ");list.add(this.psOrderDevName);}
        if (this.psOrderAppName !=null){sb.append("ps_order_app_name ").append(psOrderAppNameOperation).append(" ? and ");list.add(this.psOrderAppName);}
        if (this.psOrderState !=null){sb.append("ps_order_state ").append(psOrderStateOperation).append(" ? and ");list.add(this.psOrderState);}
        if (this.psOrderTime !=null){sb.append("ps_order_time ").append(psOrderTimeOperation).append(" ? and ");list.add(this.psOrderTime);}
        if (this.psOrderIp !=null){sb.append("ps_order_ip ").append(psOrderIpOperation).append(" ? and ");list.add(this.psOrderIp);}
        if (this.psOrderPayMoney !=null){sb.append("ps_order_pay_money ").append(psOrderPayMoneyOperation).append(" ? and ");list.add(this.psOrderPayMoney);}
        if (this.psOrderPayTime !=null){sb.append("ps_order_pay_time ").append(psOrderPayTimeOperation).append(" ? and ");list.add(this.psOrderPayTime);}
        if (this.psOrderPayType !=null){sb.append("ps_order_pay_type ").append(psOrderPayTypeOperation).append(" ? and ");list.add(this.psOrderPayType);}
        if (this.psOrderMoney !=null){sb.append("ps_order_money ").append(psOrderMoneyOperation).append(" ? and ");list.add(this.psOrderMoney);}
        if (this.psOrderDesc !=null){sb.append("ps_order_desc ").append(psOrderDescOperation).append(" ? and ");list.add(this.psOrderDesc);}
        if (this.psOrderMsg !=null){sb.append("ps_order_msg ").append(psOrderMsgOperation).append(" ? and ");list.add(this.psOrderMsg);}
        if (this.psOrderType !=null){sb.append("ps_order_type ").append(psOrderTypeOperation).append(" ? and ");list.add(this.psOrderType);}
        if (sb.substring(sb.length()-5,sb.length()).equals(" and "))sb.delete(sb.length()-5,sb.length());
        if (sb.substring(sb.length()-6,sb.length()).equals("where "))sb.delete(sb.length()-6,sb.length());
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toSelect(){
        return toWhere("select * from "+DataBase.psOrderName);
    }
    public AutoSqlEntity toDelete(){
        return toWhere("delete from "+DataBase.psOrderName);
    }
    public AutoSqlEntity toUpdate(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("update "+DataBase.psOrderName+" set ");
        if (this.psOrderId !=null){sb.append("ps_order_id=?, ");list.add(this.psOrderId);}
        if (this.psOrderUserId !=null){sb.append("ps_order_user_id=?, ");list.add(this.psOrderUserId);}
        if (this.psOrderAdminId !=null){sb.append("ps_order_admin_id=?, ");list.add(this.psOrderAdminId);}
        if (this.psOrderDevId !=null){sb.append("ps_order_dev_id=?, ");list.add(this.psOrderDevId);}
        if (this.psOrderAppId !=null){sb.append("ps_order_app_id=?, ");list.add(this.psOrderAppId);}
        if (this.psOrderUserAcc !=null){sb.append("ps_order_user_acc=?, ");list.add(this.psOrderUserAcc);}
        if (this.psOrderAdminAcc !=null){sb.append("ps_order_admin_acc=?, ");list.add(this.psOrderAdminAcc);}
        if (this.psOrderDevName !=null){sb.append("ps_order_dev_name=?, ");list.add(this.psOrderDevName);}
        if (this.psOrderAppName !=null){sb.append("ps_order_app_name=?, ");list.add(this.psOrderAppName);}
        if (this.psOrderState !=null){sb.append("ps_order_state=?, ");list.add(this.psOrderState);}
        if (this.psOrderTime !=null){sb.append("ps_order_time=?, ");list.add(this.psOrderTime);}
        if (this.psOrderIp !=null){sb.append("ps_order_ip=?, ");list.add(this.psOrderIp);}
        if (this.psOrderPayMoney !=null){sb.append("ps_order_pay_money=?, ");list.add(this.psOrderPayMoney);}
        if (this.psOrderPayTime !=null){sb.append("ps_order_pay_time=?, ");list.add(this.psOrderPayTime);}
        if (this.psOrderPayType !=null){sb.append("ps_order_pay_type=?, ");list.add(this.psOrderPayType);}
        if (this.psOrderMoney !=null){sb.append("ps_order_money=?, ");list.add(this.psOrderMoney);}
        if (this.psOrderDesc !=null){sb.append("ps_order_desc=?, ");list.add(this.psOrderDesc);}
        if (this.psOrderMsg !=null){sb.append("ps_order_msg=?, ");list.add(this.psOrderMsg);}
        if (this.psOrderType !=null){sb.append("ps_order_type=?, ");list.add(this.psOrderType);}
        if (sb.substring(sb.length()-2,sb.length()).equals(", "))sb.delete(sb.length()-2,sb.length()-1);
        if (sb.substring(sb.length()-4,sb.length()).equals("set "))sb.delete(sb.length()-4,sb.length());
        sb.append("where ps_order_id=?");list.add(this.psOrderId);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public AutoSqlEntity toInsert(){
        List<Object> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        sb.append("insert into "+DataBase.psOrderName+"(ps_order_id,ps_order_user_id,ps_order_admin_id,ps_order_dev_id,ps_order_app_id,ps_order_user_acc,ps_order_admin_acc,ps_order_dev_name,ps_order_app_name,ps_order_state,ps_order_time,ps_order_ip,ps_order_pay_money,ps_order_pay_time,ps_order_pay_type,ps_order_money,ps_order_desc,ps_order_msg,ps_order_type) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        list.add(this.psOrderId);
        list.add(this.psOrderUserId);
        list.add(this.psOrderAdminId);
        list.add(this.psOrderDevId);
        list.add(this.psOrderAppId);
        list.add(this.psOrderUserAcc);
        list.add(this.psOrderAdminAcc);
        list.add(this.psOrderDevName);
        list.add(this.psOrderAppName);
        list.add(this.psOrderState);
        list.add(this.psOrderTime);
        list.add(this.psOrderIp);
        list.add(this.psOrderPayMoney);
        list.add(this.psOrderPayTime);
        list.add(this.psOrderPayType);
        list.add(this.psOrderMoney);
        list.add(this.psOrderDesc);
        list.add(this.psOrderMsg);
        list.add(this.psOrderType);
        return new AutoSqlEntity(sb.toString(),list.toArray());
    }
    public PsOrder find(BaseDao dao) {
        return dao.psOrderFind(this);
    }

    public PsOrder findCache(BaseDao dao, int mm) {
        return dao.psOrderFindCache(this, mm);
    }

    public List<PsOrder> query(BaseDao dao) {
        return dao.psOrderQuery(this);
    }

    public List<PsOrder> queryCache(BaseDao dao, int mm) {
        return dao.psOrderQueryCache(this, mm);
    }

    public ListPage query(BaseDao dao, int page, int limit, int maxPage, int maxLimit) {
        return dao.psOrderQuery(this, page, limit, maxPage, maxLimit);
    }

    public ListPage queryCache(BaseDao dao, int page, int limit, int maxPage, int maxLimit, int mm) {
        return dao.psOrderQueryCache(this, page, limit, maxPage, maxLimit, mm);
    }

    public int save(BaseDao dao) {
        return dao.psOrderInsert(this);
    }

    public int update(BaseDao dao) {
        return dao.psOrderUpdate(this);
    }

    public int delete(BaseDao dao) {
        return dao.psOrderDelete(this);
    }

    public int saveAsy(BaseDao dao) {
        return dao.psOrderInsertAsy(this);
    }

    public int updateAsy(BaseDao dao) {
        return dao.psOrderUpdateAsy(this);
    }

    public int deleteAsy(BaseDao dao) {
        return dao.psOrderDeleteAsy(this);
    }
}