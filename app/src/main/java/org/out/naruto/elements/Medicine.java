package org.out.naruto.elements;

import java.io.Serializable;

/**
 * Created by Hao_S on 2015/5/14.
 */

public class Medicine implements Serializable{
    private String medicineName;//药品名称
    private String medicineEnglishName;
    private String medicinePinyinName;

    private String medicineComponent;//药品成份
    private String medicineProperty;//药品性状
    private String medicineIndications;//适用症，主治功能
    private String medicineSpecifications;//药品规格
    private String medicineUsage;//用法用量
    private String medicineUntowardEffect;//不良反应
    private String medicineTaboos;//禁忌
    private String medicineAttentions;//注意事项
    private String medicineInteraction;//药物互相作用
    //药理作用
    private String executiveStandard;//执行标准
    private String ApprovalNumber;//批准文号
    private String medicineCompany;//生产企业


    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedicineEnglishName() {
        return medicineEnglishName;
    }

    public void setMedicineEnglishName(String medicineEnglishName) {
        this.medicineEnglishName = medicineEnglishName;
    }

    public String getMedicinePinyinName() {
        return medicinePinyinName;
    }

    public void setMedicinePinyinName(String medicinePinyinName) {
        this.medicinePinyinName = medicinePinyinName;
    }

    public String getMedicineComponent() {
        return medicineComponent;
    }

    public void setMedicineComponent(String medicineComponent) {
        this.medicineComponent = medicineComponent;
    }

    public String getMedicineProperty() {
        return medicineProperty;
    }

    public void setMedicineProperty(String medicineProperty) {
        this.medicineProperty = medicineProperty;
    }

    public String getMedicineIndications() {
        return medicineIndications;
    }

    public void setMedicineIndications(String medicineIndications) {
        this.medicineIndications = medicineIndications;
    }

    public String getMedicineSpecifications() {
        return medicineSpecifications;
    }

    public void setMedicineSpecifications(String medicineSpecifications) {
        this.medicineSpecifications = medicineSpecifications;
    }

    public String getMedicineUsage() {
        return medicineUsage;
    }

    public void setMedicineUsage(String medicineUsage) {
        this.medicineUsage = medicineUsage;
    }

    public String getMedicineUntowardEffect() {
        return medicineUntowardEffect;
    }

    public void setMedicineUntowardEffect(String medicineUntowardEffect) {
        this.medicineUntowardEffect = medicineUntowardEffect;
    }

    public String getMedicineTaboos() {
        return medicineTaboos;
    }

    public void setMedicineTaboos(String medicineTaboos) {
        this.medicineTaboos = medicineTaboos;
    }

    public String getMedicineAttentions() {
        return medicineAttentions;
    }

    public void setMedicineAttentions(String medicineAttentions) {
        this.medicineAttentions = medicineAttentions;
    }

    public String getMedicineInteraction() {
        return medicineInteraction;
    }

    public void setMedicineInteraction(String medicineInteraction) {
        this.medicineInteraction = medicineInteraction;
    }

    public String getExecutiveStandard() {
        return executiveStandard;
    }

    public void setExecutiveStandard(String executiveStandard) {
        this.executiveStandard = executiveStandard;
    }

    public String getApprovalNumber() {
        return ApprovalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        ApprovalNumber = approvalNumber;
    }

    public String getMedicineCompany() {
        return medicineCompany;
    }

    public void setMedicineCompany(String medicineCompany) {
        this.medicineCompany = medicineCompany;
    }
}
