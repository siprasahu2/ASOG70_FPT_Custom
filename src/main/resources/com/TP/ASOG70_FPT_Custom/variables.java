package com.TP.ASOG70_FPT_Custom;

public class variables implements java.io.Serializable {
static final long serialVersionUID = 1L;
public variables(){}
private com.wisor.brms.asog.SvcType svcTyp;
private ilog.rules.factory.IlrReflect reflect;
private ilog.rules.xml.IlrXmlObject object;
private java.lang.String supValue;
private java.lang.String call_webservice;
private java.lang.String vtaPreconditionEUSA;
private java.lang.String vtaPreconditionSA2POINT;
private java.lang.String bypassPNUM;
private java.lang.String bypassProject;
private java.lang.String bypassCANOPI;
private java.lang.String modifiedXml;
private java.lang.Boolean reqtypCheck;
public com.wisor.brms.asog.SvcType getSvcTyp() {
return svcTyp;
}
public void setSvcTyp(com.wisor.brms.asog.SvcType svcTyp){
this.svcTyp=svcTyp;
}
public ilog.rules.factory.IlrReflect getReflect() {
return reflect;
}
public void setReflect(ilog.rules.factory.IlrReflect reflect){
this.reflect=reflect;
}
public java.lang.String getVtaPreconditionSA2POINT() {
return vtaPreconditionSA2POINT;
}
public void setVtaPreconditionSA2POINT(java.lang.String vtaPreconditionSA2POINT){
this.vtaPreconditionSA2POINT=vtaPreconditionSA2POINT;
}
public java.lang.String getBypassPNUM() {
return bypassPNUM;
}
public void setBypassPNUM(java.lang.String bypassPNUM){
this.bypassPNUM=bypassPNUM;
}
public java.lang.String getCall_webservice() {
return call_webservice;
}
public void setCall_webservice(java.lang.String call_webservice){
this.call_webservice=call_webservice;
}
public java.lang.String getVtaPreconditionEUSA() {
return vtaPreconditionEUSA;
}
public void setVtaPreconditionEUSA(java.lang.String vtaPreconditionEUSA){
this.vtaPreconditionEUSA=vtaPreconditionEUSA;
}
public java.lang.String getBypassCANOPI() {
return bypassCANOPI;
}
public void setBypassCANOPI(java.lang.String bypassCANOPI){
this.bypassCANOPI=bypassCANOPI;
}
public java.lang.String getSupValue() {
return supValue;
}
public void setSupValue(java.lang.String supValue){
this.supValue=supValue;
}
public java.lang.String getModifiedXml() {
return modifiedXml;
}
public void setModifiedXml(java.lang.String modifiedXml){
this.modifiedXml=modifiedXml;
}
public java.lang.Boolean getReqtypCheck() {
return reqtypCheck;
}
public void setReqtypCheck(java.lang.Boolean reqtypCheck){
this.reqtypCheck=reqtypCheck;
}
public java.lang.String getBypassProject() {
return bypassProject;
}
public void setBypassProject(java.lang.String bypassProject){
this.bypassProject=bypassProject;
}
public ilog.rules.xml.IlrXmlObject getObject() {
return object;
}
public void setObject(ilog.rules.xml.IlrXmlObject object){
this.object=object;
}

}