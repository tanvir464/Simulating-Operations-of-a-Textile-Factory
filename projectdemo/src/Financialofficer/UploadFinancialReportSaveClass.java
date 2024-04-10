/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Financialofficer;

import java.io.Serializable;
import java.time.LocalDate;


/**
 *
 * @author Afra
 */
public class UploadFinancialReportSaveClass implements Serializable{
    private LocalDate uploadDate;
    private String uploadFinancialReportAmountTF;
    private String uploadFinancialReportDescriptionTF;
    private String uploadFinancialReportTypeCB;

    public LocalDate getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDate uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getUploadFinancialReportAmountTF() {
        return uploadFinancialReportAmountTF;
    }

    public void setUploadFinancialReportAmountTF(String uploadFinancialReportAmountTF) {
        this.uploadFinancialReportAmountTF = uploadFinancialReportAmountTF;
    }

    public String getUploadFinancialReportDescriptionTF() {
        return uploadFinancialReportDescriptionTF;
    }

    public void setUploadFinancialReportDescriptionTF(String uploadFinancialReportDescriptionTF) {
        this.uploadFinancialReportDescriptionTF = uploadFinancialReportDescriptionTF;
    }

    public String getUploadFinancialReportTypeCB() {
        return uploadFinancialReportTypeCB;
    }

    public void setUploadFinancialReportTypeCB(String uploadFinancialReportTypeCB) {
        this.uploadFinancialReportTypeCB = uploadFinancialReportTypeCB;
    }

    public UploadFinancialReportSaveClass(String uploadFinancialReportAmountTF, String uploadFinancialReportDescriptionTF, String uploadFinancialReportTypeCB, String dateString) {
        this.uploadDate = uploadDate;
        this.uploadFinancialReportAmountTF = uploadFinancialReportAmountTF;
        this.uploadFinancialReportDescriptionTF = uploadFinancialReportDescriptionTF;
        this.uploadFinancialReportTypeCB = uploadFinancialReportTypeCB;
    }

    @Override
    public String toString() {
        return "UploadFinancialReportSaveClass{" + "uploadDate=" + uploadDate + ", uploadFinancialReportAmountTF=" + uploadFinancialReportAmountTF + ", uploadFinancialReportDescriptionTF=" + uploadFinancialReportDescriptionTF + ", uploadFinancialReportTypeCB=" + uploadFinancialReportTypeCB + '}';
    }
    
    
}

