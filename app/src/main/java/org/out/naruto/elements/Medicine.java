package org.out.naruto.elements;

import java.io.Serializable;

/**
 * Created by Hao_S on 2015/5/14.
 */

public class Medicine implements Serializable{
    private int medicineId;//药品ID

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

    public Medicine setMedicineName(String medicineName) {
        this.medicineName = medicineName;
        return this;
    }

    public String getMedicineEnglishName() {
        return medicineEnglishName;
    }

    public Medicine setMedicineEnglishName(String medicineEnglishName) {
        this.medicineEnglishName = medicineEnglishName;
        return this;
    }

    public String getMedicinePinyinName() {
        return medicinePinyinName;
    }

    public Medicine setMedicinePinyinName(String medicinePinyinName) {
        this.medicinePinyinName = medicinePinyinName;
        return this;
    }

    public String getMedicineComponent() {
        return medicineComponent;
    }

    public Medicine setMedicineComponent(String medicineComponent) {
        this.medicineComponent = medicineComponent;
        return this;
    }

    public String getMedicineProperty() {
        return medicineProperty;
    }

    public Medicine setMedicineProperty(String medicineProperty) {
        this.medicineProperty = medicineProperty;
        return this;
    }

    public String getMedicineIndications() {
        return medicineIndications;
    }

    public Medicine setMedicineIndications(String medicineIndications) {
        this.medicineIndications = medicineIndications;
        return this;
    }

    public String getMedicineSpecifications() {
        return medicineSpecifications;
    }

    public Medicine setMedicineSpecifications(String medicineSpecifications) {
        this.medicineSpecifications = medicineSpecifications;
        return this;
    }

    public String getMedicineUsage() {
        return medicineUsage;
    }

    public Medicine setMedicineUsage(String medicineUsage) {
        this.medicineUsage = medicineUsage;
        return this;
    }

    public String getMedicineUntowardEffect() {
        return medicineUntowardEffect;
    }

    public Medicine setMedicineUntowardEffect(String medicineUntowardEffect) {
        this.medicineUntowardEffect = medicineUntowardEffect;
        return this;
    }

    public String getMedicineTaboos() {
        return medicineTaboos;
    }

    public Medicine setMedicineTaboos(String medicineTaboos) {
        this.medicineTaboos = medicineTaboos;
        return this;
    }

    public String getMedicineAttentions() {
        return medicineAttentions;
    }

    public Medicine setMedicineAttentions(String medicineAttentions) {
        this.medicineAttentions = medicineAttentions;
        return this;
    }

    public String getMedicineInteraction() {
        return medicineInteraction;
    }

    public Medicine setMedicineInteraction(String medicineInteraction) {
        this.medicineInteraction = medicineInteraction;
        return this;
    }

    public String getExecutiveStandard() {
        return executiveStandard;
    }

    public Medicine setExecutiveStandard(String executiveStandard) {
        this.executiveStandard = executiveStandard;
        return this;
    }

    public String getApprovalNumber() {
        return ApprovalNumber;
    }

    public Medicine setApprovalNumber(String approvalNumber) {
        ApprovalNumber = approvalNumber;
        return this;
    }

    public String getMedicineCompany() {
        return medicineCompany;
    }

    public Medicine setMedicineCompany(String medicineCompany) {
        this.medicineCompany = medicineCompany;
        return this;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public Medicine setMedicineId(int medicineId) {
        this.medicineId = medicineId;
        return this;
    }
}
