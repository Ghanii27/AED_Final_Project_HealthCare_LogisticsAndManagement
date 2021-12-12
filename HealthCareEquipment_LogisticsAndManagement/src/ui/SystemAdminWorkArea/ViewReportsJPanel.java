/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.SystemAdminWorkArea;

import Schema.DataGenerator;
import Schema.EcoSystem;
import Schema.Supplier.Product;
import Schema.WorkQueue.DoctorWorkRequest;
import Schema.WorkQueue.HealthcareEquipmentWorkRequest;
import Schema.WorkQueue.PharmacyWorkRequest;
import java.awt.Color;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author 16176
 */
public class ViewReportsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem system;
    private DataGenerator dataGen;
    

    /**
     * Creates new form ViewReportsJPanel
     */
    public ViewReportsJPanel(JPanel userprocessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        networkLevelRepLbl = new javax.swing.JLabel();
        ntwReport1 = new javax.swing.JButton();
        ntwReport2 = new javax.swing.JButton();
        entLevelRepLbl1 = new javax.swing.JLabel();
        entReport1 = new javax.swing.JButton();
        entReport2 = new javax.swing.JButton();
        orgLevelRepLbl = new javax.swing.JLabel();
        orgReport1 = new javax.swing.JButton();
        orgReport2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        networkLevelRepLbl.setText("NETWORK LEVEL REPORTS >>");

        ntwReport1.setText("Report 1");
        ntwReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntwReport1ActionPerformed(evt);
            }
        });

        ntwReport2.setText("Report 2");
        ntwReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntwReport2ActionPerformed(evt);
            }
        });

        entLevelRepLbl1.setText("ENTERPRISE LEVEL REPORTS >>");

        entReport1.setText("Report 1");
        entReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entReport1ActionPerformed(evt);
            }
        });

        entReport2.setText("Report 2");
        entReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entReport2ActionPerformed(evt);
            }
        });

        orgLevelRepLbl.setText("ORGANIZATION LEVEL REPORTS >>");

        orgReport1.setText("Report 1");
        orgReport1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgReport1ActionPerformed(evt);
            }
        });

        orgReport2.setText("Report 2");
        orgReport2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgReport2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(entLevelRepLbl1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgLevelRepLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(networkLevelRepLbl))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ntwReport2)
                                    .addComponent(ntwReport1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orgReport2)
                                    .addComponent(orgReport1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(entReport1)
                                    .addComponent(entReport2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(networkLevelRepLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ntwReport1)
                .addGap(18, 18, 18)
                .addComponent(ntwReport2)
                .addGap(18, 18, 18)
                .addComponent(entLevelRepLbl1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(entReport1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entReport2)
                .addGap(18, 18, 18)
                .addComponent(orgLevelRepLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orgReport1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(orgReport2)
                .addContainerGap(755, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 771, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 414, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 323, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ntwReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntwReport1ActionPerformed
         DefaultCategoryDataset dcd= new DefaultCategoryDataset();
         int thermometer=0;int Stethescope=0;int stretcher=0;int microscope=0;int syringe=0;int Bpkit=0;
         int thermometer1=0;int Stethescope1=0;int stretcher1=0;int microscope1=0;int syringe1=0;int Bpkit1=0;
         int thermometer2=0, Stethescope2=0, stretcher2=0, microscope2=0, syringe2=0,Bpkit2=0;
         int thermometer3=0, Stethescope3=0, stretcher3=0, microscope3=0, syringe3=0,Bpkit3=0;
     
            
             for(int i=0;i<500;i++){
                 
               HealthcareEquipmentWorkRequest request=DataGenerator.InitMedicalRequest();
         
             String name=request.getEquipmentName();
             String network=request.getNetwork();
           
             if((network.equalsIgnoreCase("Boston")) && (name.equalsIgnoreCase("Thermometer"))){
                 thermometer++;
                 
             }
             
             else if((network.equalsIgnoreCase("Boston")) && (name.equalsIgnoreCase("Stethescope"))){
                 Stethescope++;
               
             }
             else if ((network.equalsIgnoreCase("Boston"))&&(name.equalsIgnoreCase("Syringe"))){
                 syringe++;
                 
             }
             else if ((network.equalsIgnoreCase("Boston"))&&(name.equalsIgnoreCase("Microscope"))){
                 microscope++;
             }
             else if ((network.equalsIgnoreCase("Boston"))&&(name.equalsIgnoreCase("Blood pressure Kit"))){
                 Bpkit++;
             }
             else if ((network.equalsIgnoreCase("Boston"))&&(name.equalsIgnoreCase("Stretcher"))){
                 stretcher++;
             }
           
         }
        dcd.setValue(thermometer, "Boston", "Thermometer");
        dcd.setValue(Stethescope, "Boston", "Stethescope");
        dcd.setValue(syringe, "Boston", "Syringe");
        dcd.setValue(microscope, "Boston", "Microscope");
        dcd.setValue(Bpkit, "Boston", "Blood pressure Kit");
        dcd.setValue(stretcher, "Boston", "Stretcher");
         
       JFreeChart jchart = ChartFactory.createBarChart("FREQUENTLY USED EQUIPMENT", "EQUIPMENT NAME", "USAGE", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Most Used Equipment",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800);  
        
    
       
    for(int i=0;i<500;i++){
           HealthcareEquipmentWorkRequest request=DataGenerator.InitMedicalRequest();
         
             String name=request.getEquipmentName();
             String network=request.getNetwork();
               if(network.equalsIgnoreCase("waltham")){
             if(name.equalsIgnoreCase("Thermometer")){
                 thermometer1++;
             }
             
             else if(name.equalsIgnoreCase("Stethescope")){
                 Stethescope1++;
             }
             else if (name.equalsIgnoreCase("Syringe")){
                 syringe1++;
             }
             else if (name.equalsIgnoreCase("Microscope")){
                 microscope1++;
             }
             else if (name.equalsIgnoreCase("Blood pressure Kit")){
                 Bpkit1++;
             }
             else if (name.equalsIgnoreCase("Stretcher")){
                 stretcher1++;
             }}}
    
             dcd.setValue(thermometer1, "waltham", "Thermometer");
        dcd.setValue(Stethescope1, "waltham", "Stethescope");
        dcd.setValue(syringe1, "waltham", "Syringe");
        dcd.setValue(microscope1, "waltham", "Microscope");
        dcd.setValue(Bpkit1, "waltham", "Blood pressure Kit");
        dcd.setValue(stretcher1, "waltham", "Stretcher");
       
       CategoryPlot plot1 = jchart.getCategoryPlot();
       plot1.setRangeGridlinePaint(Color.BLACK);
       
       
        for(int i=0;i<500;i++){
           HealthcareEquipmentWorkRequest request=DataGenerator.InitMedicalRequest();
         
             String name=request.getEquipmentName();
             String network=request.getNetwork();
               if(network.equalsIgnoreCase("Cambridge")){
             if(name.equalsIgnoreCase("Thermometer")){
                 thermometer2++;
             }
             
             else if(name.equalsIgnoreCase("Stethescope")){
                 Stethescope2++;
             }
             else if (name.equalsIgnoreCase("Syringe")){
                 syringe2++;
             }
             else if (name.equalsIgnoreCase("Microscope")){
                 microscope2++;
             }
             else if (name.equalsIgnoreCase("Blood pressure Kit")){
                 Bpkit2++;
             }
             else if (name.equalsIgnoreCase("Stretcher")){
                 stretcher2++;
             }}}
    
             dcd.setValue(thermometer2, "Cambridge", "Thermometer");
        dcd.setValue(Stethescope2, "Cambridge", "Stethescope");
        dcd.setValue(syringe2, "Cambridge", "Syringe");
        dcd.setValue(microscope2, "Cambridge", "Microscope");
        dcd.setValue(Bpkit2, "Cambridge", "Blood pressure Kit");
        dcd.setValue(stretcher2, "Cambridge", "Stretcher");
       
       CategoryPlot plot2 = jchart.getCategoryPlot();
       plot2.setRangeGridlinePaint(Color.BLACK);
       
       
           for(int i=0;i<500;i++){
           HealthcareEquipmentWorkRequest request=DataGenerator.InitMedicalRequest();
         
             String name=request.getEquipmentName();
             String network=request.getNetwork();
               if(network.equalsIgnoreCase("Framingham")){
             if(name.equalsIgnoreCase("Thermometer")){
                 thermometer3++;
             }
             
             else if(name.equalsIgnoreCase("Stethescope")){
                 Stethescope3++;
             }
             else if (name.equalsIgnoreCase("Syringe")){
                 syringe3++;
             }
             else if (name.equalsIgnoreCase("Microscope")){
                 microscope3++;
             }
             else if (name.equalsIgnoreCase("Blood pressure Kit")){
                 Bpkit3++;
             }
             else if (name.equalsIgnoreCase("Stretcher")){
                 stretcher3++;
             }}}
    
             dcd.setValue(thermometer3, "Framingham", "Thermometer");
        dcd.setValue(Stethescope3, "Framingham", "Stethescope");
        dcd.setValue(syringe3, "Framingham", "Syringe");
        dcd.setValue(microscope3, "Framingham", "Microscope");
        dcd.setValue(Bpkit3, "Framingham", "Blood pressure Kit");
        dcd.setValue(stretcher3, "Framingham", "Stretcher");
       
       CategoryPlot plot3 = jchart.getCategoryPlot();
       plot3.setRangeGridlinePaint(Color.BLACK);
         
                // TODO add your handling code here:
    }//GEN-LAST:event_ntwReport1ActionPerformed

    private void ntwReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntwReport2ActionPerformed
        DefaultCategoryDataset dcd= new DefaultCategoryDataset();
        int count1=0, count2=0, count3=0, count4=0;
        
         for(int i=0;i<500;i++){
                 
               PharmacyWorkRequest request=DataGenerator.InitSupplierInfo();
         
             String network=request.getNetwork();
             
              if(network.equalsIgnoreCase("Boston")){
              count1++;
              }  
         }
        dcd.setValue(count1, "Suppliers", "Boston");
         
       JFreeChart jchart = ChartFactory.createBarChart3D("Suppliers Information", "Network", "Number of Suppliers", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Suppliers Information",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800); 
       
        for(int i=0;i<500;i++){
                 
         PharmacyWorkRequest request=DataGenerator.InitSupplierInfo();
         String network=request.getNetwork();
             
              if(network.equalsIgnoreCase("Cambridge")){
              count2++;
              }  
         }
        dcd.setValue(count2, "Suppliers", "Cambridge"); 
         
         CategoryPlot plot1 = jchart.getCategoryPlot();
       plot1.setRangeGridlinePaint(Color.BLACK);
       
       for(int i=0;i<500;i++){
                 
         PharmacyWorkRequest request=DataGenerator.InitSupplierInfo();
         String network=request.getNetwork();
             
              if(network.equalsIgnoreCase("Waltham")){
              count3++;
              }  
         }
        dcd.setValue(count3, "Suppliers", "Waltham"); 
         
         CategoryPlot plot3 = jchart.getCategoryPlot();
       plot3.setRangeGridlinePaint(Color.BLACK);
       
       for(int i=0;i<500;i++){
                 
         PharmacyWorkRequest request=DataGenerator.InitSupplierInfo();
         String network=request.getNetwork();
             
              if(network.equalsIgnoreCase("Framingham")){
              count4++;
              }  
         }
        dcd.setValue(count4, "Suppliers", "Framingham"); 
         
         CategoryPlot plot4 = jchart.getCategoryPlot();
       plot4.setRangeGridlinePaint(Color.BLACK);
       
                // TODO add your handling code here:
    }//GEN-LAST:event_ntwReport2ActionPerformed

    private void entReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entReport1ActionPerformed
        DefaultCategoryDataset dcd= new DefaultCategoryDataset();
        int count1=0, count2=0, count3=0, count4=0,count5=0,count6=0,count7=0,count8=0;
        
         for(int i=0;i<5000;i++){
                 
               DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
               String hospital=request.getHospitalName();
             
              if(hospital.equalsIgnoreCase("MGH")){
              count1++;
              }  
         }
        dcd.setValue(count1, "Paitents", "MGH");
         
       JFreeChart jchart = ChartFactory.createBarChart3D("Paitents Information", "Hospitals", "Number of Paitents", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Paitents Information",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800); 
       
        for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Beth Israel")){
              count2++;
              }   
         }
        dcd.setValue(count2, "Paitents", "Beth Israel"); 
         
         CategoryPlot plot1= jchart.getCategoryPlot();
       plot1.setRangeGridlinePaint(Color.BLACK);
       
        for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Tufts")){
              count3++;
              }   
         }
        dcd.setValue(count3, "Paitents", "Tufts"); 
         
         CategoryPlot plot2= jchart.getCategoryPlot();
       plot2.setRangeGridlinePaint(Color.BLACK);
       
       for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("South Shore")){
              count4++;
              }   
         }
        dcd.setValue(count4, "Paitents", "South Shore"); 
         
         CategoryPlot plot3= jchart.getCategoryPlot();
       plot3.setRangeGridlinePaint(Color.BLACK);
       
       for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Cape cod")){
              count5++;
              }   
         }
        dcd.setValue(count5, "Paitents", "Cape cod"); 
         
         CategoryPlot plot4= jchart.getCategoryPlot();
       plot4.setRangeGridlinePaint(Color.BLACK);
       
       
       for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Boston medical")){
              count6++;
              }   
         }
        dcd.setValue(count6, "Paitents", "Boston Medical"); 
         
         CategoryPlot plot5= jchart.getCategoryPlot();
       plot5.setRangeGridlinePaint(Color.BLACK);
       
       
       for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Winchester")){
              count7++;
              }   
         }
        dcd.setValue(count7, "Paitents", "Winchester"); 
         
         CategoryPlot plot6= jchart.getCategoryPlot();
       plot6.setRangeGridlinePaint(Color.BLACK);
       
       
       
       for(int i=0;i<5000;i++){
         
             DoctorWorkRequest request=DataGenerator.InitPaitenceInfo();
             String hospital=request.getHospitalName();
             
               if(hospital.equalsIgnoreCase("Brigham")){
              count8++;
              }   
         }
        dcd.setValue(count8, "Paitents", "Brigham"); 
         
         CategoryPlot plot7= jchart.getCategoryPlot();
       plot7.setRangeGridlinePaint(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_entReport1ActionPerformed

    private void entReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entReport2ActionPerformed
        
         DefaultCategoryDataset dcd= new DefaultCategoryDataset();
         int Synthroid=0, Crestor=0,Ventolin=0,esomeprazole=0,insulin=0, infliximab=0, fluticasone=0,rosuvastatin=0;
         
         for(int i=0;i<100000;i++){
           Product request=DataGenerator.InitMedicineName();
         
             String name=request.getNameOfMedicine();
             
              if(name.equalsIgnoreCase("Synthroid")){
                Synthroid++;
             }
             
             else if(name.equalsIgnoreCase("Crestor")){
                 Crestor++;
             }
             else if (name.equalsIgnoreCase("Ventolin")){
                 Ventolin++;
             }
             else if (name.equalsIgnoreCase("esomeprazole")){
                 esomeprazole++;
             }
             else if (name.equalsIgnoreCase("insulin")){
                 insulin++;
             }
             else if (name.equalsIgnoreCase("infliximab")){
                 infliximab++;
             }
                else if (name.equalsIgnoreCase("fluticasone")){
                 fluticasone++;
             }
              else if (name.equalsIgnoreCase("rosuvastatin")){
                 rosuvastatin++;
             }
         }
         dcd.setValue(Synthroid, "Medicines", "Synthroid");
        dcd.setValue(Crestor, "Medicines", "Crestor");
        dcd.setValue(Ventolin, "Medicines", "Ventolin");
        dcd.setValue(esomeprazole, "Medicines", "esomeprazole");
        dcd.setValue(insulin, "Medicines", "insulin");
        dcd.setValue(infliximab, "Medicines", "infliximab");
        dcd.setValue(fluticasone, "Medicines", "fluticasone");
        dcd.setValue(rosuvastatin, "Medicines", "rosuvastatin");
         
       JFreeChart jchart = ChartFactory.createBarChart3D("Top Medicines By Sales", "Medicines", "Sales", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Medicines",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800);         // TODO add your handling code here:
    }//GEN-LAST:event_entReport2ActionPerformed

    private void orgReport1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgReport1ActionPerformed
        
        DefaultCategoryDataset dcd= new DefaultCategoryDataset();
        
        int i=2,j=5;
        
        if(i==2){
       
        dcd.setValue(82, "without Usecases", "Doctor");
        dcd.setValue(25, "without Usecases", "Pharmacy");
         dcd.setValue(200, "without Usecases", "Equipment");
        dcd.setValue(125, "without Usecases", "Supplier");
        dcd.setValue(105, "without Usecases", "Transportation");
       
        }
         
       JFreeChart jchart = ChartFactory.createBarChart3D("MGH Profits per annum", "Organisations", "Profits(In Thousand Dollars $)", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
        
       
       if(j==5){
        dcd.setValue(105, "with Usecases", "Doctor");
        dcd.setValue(55, "with Usecases", "Pharmacy");
        dcd.setValue(298, "with Usecases", "Equipment");
        dcd.setValue(208, "with Usecases", "Supplier");
        dcd.setValue(195, "with Usecases", "Transportation");
        
       }
        
        //JFreeChart jchart1 = ChartFactory.createBarChart("MGH Profits per annum", "with Usecases", "Profits(In Thousand Dollars $)", dcd1, PlotOrientation.VERTICAL, true, true, false);
        
       CategoryPlot plot1 = jchart.getCategoryPlot();
       plot1.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Profits",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800);         // TODO add your handling code here:
    }//GEN-LAST:event_orgReport1ActionPerformed

    private void orgReport2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgReport2ActionPerformed
        DefaultCategoryDataset dcd= new DefaultCategoryDataset();
         int mmr=0, HepB=0,tdap=0,megB=0,flu=0, hpv=0, varicella=0;
         int mmr1=0, HepB1=0,tdap1=0,megB1=0,flu1=0, hpv1=0, varicella1=0;
         int mmr2=0, HepB2=0,tdap2=0,megB2=0,flu2=0, hpv2=0, varicella2=0;
         int mmr3=0, HepB3=0,tdap3=0,megB3=0,flu3=0, hpv3=0, varicella3=0;
         int mmr4=0, HepB4=0,tdap4=0,megB4=0,flu4=0, hpv4=0, varicella4=0;
         
          for(int i=0;i<5000;i++){
           Product request=DataGenerator.InitVaccineName();
         
             String name=request.getNameOfVaccine();
             String network=request.getNameOfHospital();
               if(network.equalsIgnoreCase("Boston Medical")){
                   
             if(name.equalsIgnoreCase("Meningococcal")){
                megB++;
             }
             
             else if(name.equalsIgnoreCase("Tdap")){
                 tdap++;
             }
             else if (name.equalsIgnoreCase("Hepititis B")){
                 HepB++;
             }
             else if (name.equalsIgnoreCase("HPV")){
                 hpv++;
             }
             else if (name.equalsIgnoreCase("Varicella")){
                 varicella++;
             }
             else if (name.equalsIgnoreCase("Seasonal Flu")){
                 flu++;
             }
                else if (name.equalsIgnoreCase("MMR")){
                 mmr++;
             }}}
         dcd.setValue(megB, "Boston Medical", "Meningococcal");
        dcd.setValue(tdap, "Boston Medical", "Tdap");
        dcd.setValue(HepB, "Boston Medical", "Hepititis B");
        dcd.setValue(hpv, "Boston Medical", "HPV");
        dcd.setValue(varicella, "Boston Medical", "Varicella");
        dcd.setValue(flu, "Boston Medical", "Seasonal Flu");
        dcd.setValue(mmr, "Boston Medical", "MMR");
         
       JFreeChart jchart = ChartFactory.createBarChart3D("VACCINES FOR STUDENTS(age 19-27)", "VACCINES", "USAGE", dcd, PlotOrientation.VERTICAL, true, true, false);
       
       CategoryPlot plot = jchart.getCategoryPlot();
       plot.setRangeGridlinePaint(Color.BLACK);
       
       
       ChartFrame chartFrame = new ChartFrame("Vaccines",jchart,true);
       chartFrame.setVisible(true);
       chartFrame.setSize(1000,800); 
       
         for(int i=0;i<5000;i++){
           Product request=DataGenerator.InitVaccineName();
         
             String name=request.getNameOfVaccine();
             String network=request.getNameOfHospital();
               if(network.equalsIgnoreCase("MGH")){
                   
             if(name.equalsIgnoreCase("Meningococcal")){
                megB1++;
             }
             
             else if(name.equalsIgnoreCase("Tdap")){
                 tdap1++;
             }
             else if (name.equalsIgnoreCase("Hepititis B")){
                 HepB1++;
             }
             else if (name.equalsIgnoreCase("HPV")){
                 hpv1++;
             }
             else if (name.equalsIgnoreCase("Varicella")){
                 varicella1++;
             }
             else if (name.equalsIgnoreCase("Seasonal Flu")){
                 flu1++;
             }
                else if (name.equalsIgnoreCase("MMR")){
                 mmr1++;
             }}}
         dcd.setValue(megB1, "MGH", "Meningococcal");
        dcd.setValue(tdap1, "MGH", "Tdap");
        dcd.setValue(HepB1, "MGH", "Hepititis B");
        dcd.setValue(hpv1, "MGH", "HPV");
        dcd.setValue(varicella1, "MGH", "Varicella");
        dcd.setValue(flu1, "MGH", "Seasonal Flu");
        dcd.setValue(mmr1, "MGH", "MMR");
        
       CategoryPlot plot1 = jchart.getCategoryPlot();
       plot1.setRangeGridlinePaint(Color.BLACK);
       
       
        for(int i=0;i<5000;i++){
           Product request=DataGenerator.InitVaccineName();
         
             String name=request.getNameOfVaccine();
             String network=request.getNameOfHospital();
               if(network.equalsIgnoreCase("MGH")){
                   
             if(name.equalsIgnoreCase("Meningococcal")){
                megB2++;
             }
             
             else if(name.equalsIgnoreCase("Tdap")){
                 tdap2++;
             }
             else if (name.equalsIgnoreCase("Hepititis B")){
                 HepB2++;
             }
             else if (name.equalsIgnoreCase("HPV")){
                 hpv2++;
             }
             else if (name.equalsIgnoreCase("Varicella")){
                 varicella2++;
             }
             else if (name.equalsIgnoreCase("Seasonal Flu")){
                 flu2++;
             }
                else if (name.equalsIgnoreCase("MMR")){
                 mmr2++;
             }}}
         dcd.setValue(megB2, "Tufts", "Meningococcal");
        dcd.setValue(tdap2, "Tufts", "Tdap");
        dcd.setValue(HepB2, "Tufts", "Hepititis B");
        dcd.setValue(hpv2, "Tufts", "HPV");
        dcd.setValue(varicella2, "Tufts", "Varicella");
        dcd.setValue(flu2, "Tufts", "Seasonal Flu");
        dcd.setValue(mmr2, "Tufts", "MMR");
        
       CategoryPlot plot2 = jchart.getCategoryPlot();
       plot2.setRangeGridlinePaint(Color.BLACK);
         
       
       for(int i=0;i<5000;i++){
           Product request=DataGenerator.InitVaccineName();
         
             String name=request.getNameOfVaccine();
             String network=request.getNameOfHospital();
               if(network.equalsIgnoreCase("Cape cod")){
                   
             if(name.equalsIgnoreCase("Meningococcal")){
                megB3++;
             }
             
             else if(name.equalsIgnoreCase("Tdap")){
                 tdap3++;
             }
             else if (name.equalsIgnoreCase("Hepititis B")){
                 HepB3++;
             }
             else if (name.equalsIgnoreCase("HPV")){
                 hpv3++;
             }
             else if (name.equalsIgnoreCase("Varicella")){
                 varicella3++;
             }
             else if (name.equalsIgnoreCase("Seasonal Flu")){
                 flu3++;
             }
                else if (name.equalsIgnoreCase("MMR")){
                 mmr3++;
             }}}
         dcd.setValue(megB3, "Cape cod", "Meningococcal");
        dcd.setValue(tdap3, "Cape cod", "Tdap");
        dcd.setValue(HepB3, "Cape cod", "Hepititis B");
        dcd.setValue(hpv3, "Cape cod", "HPV");
        dcd.setValue(varicella3, "Cape cod", "Varicella");
        dcd.setValue(flu3, "Cape cod", "Seasonal Flu");
        dcd.setValue(mmr3, "Cape cod", "MMR");
        
       CategoryPlot plot3 = jchart.getCategoryPlot();
       plot3.setRangeGridlinePaint(Color.BLACK);
       
       
       for(int i=0;i<5000;i++){
           Product request=DataGenerator.InitVaccineName();
         
             String name=request.getNameOfVaccine();
             String network=request.getNameOfHospital();
               if(network.equalsIgnoreCase("South Shore")){
                   
             if(name.equalsIgnoreCase("Meningococcal")){
                megB4++;
             }
             
             else if(name.equalsIgnoreCase("Tdap")){
                 tdap4++;
             }
             else if (name.equalsIgnoreCase("Hepititis B")){
                 HepB4++;
             }
             else if (name.equalsIgnoreCase("HPV")){
                 hpv4++;
             }
             else if (name.equalsIgnoreCase("Varicella")){
                 varicella4++;
             }
             else if (name.equalsIgnoreCase("Seasonal Flu")){
                 flu4++;
             }
                else if (name.equalsIgnoreCase("MMR")){
                 mmr4++;
             }}}
         dcd.setValue(megB4, "South Shore", "Meningococcal");
        dcd.setValue(tdap4, "South Shore", "Tdap");
        dcd.setValue(HepB4, "South Shore", "Hepititis B");
        dcd.setValue(hpv4, "South Shore", "HPV");
        dcd.setValue(varicella4, "South Shore", "Varicella");
        dcd.setValue(flu4, "South Shore", "Seasonal Flu");
        dcd.setValue(mmr4, "South Shore", "MMR");
        
       CategoryPlot plot5 = jchart.getCategoryPlot();
       plot5.setRangeGridlinePaint(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_orgReport2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel entLevelRepLbl1;
    private javax.swing.JButton entReport1;
    private javax.swing.JButton entReport2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel networkLevelRepLbl;
    private javax.swing.JButton ntwReport1;
    private javax.swing.JButton ntwReport2;
    private javax.swing.JLabel orgLevelRepLbl;
    private javax.swing.JButton orgReport1;
    private javax.swing.JButton orgReport2;
    // End of variables declaration//GEN-END:variables
}
