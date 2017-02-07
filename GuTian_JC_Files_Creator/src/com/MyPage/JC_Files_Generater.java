/*
 * JC_Files_Generater.java
 *
 * Created on __DATE__, __TIME__
 */

package com.MyPage;

import javax.swing.JOptionPane;

import com.MyCode.*;
import com.MyCode.MyClass.*;

/**
 * 
 * @author __USER__
 */
public class JC_Files_Generater extends javax.swing.JFrame {

	public static Building_Info building_info = new Building_Info();
	public static File_Other_Info file_other_info = new File_Other_Info();
	public static Litigant_Info litigant_info = new Litigant_Info();

	/** Creates new form JC_Files_Generater */
	public JC_Files_Generater() {
		initComponents();

		this.isFullTop_Group.add(cb_isFullTop_no);
		this.isFullTop_Group.add(cb_isFullTop_yes);

		this.isMoveIn_Group.add(cb_isMoveIn_no);
		this.isMoveIn_Group.add(cb_isMoveIn_yes);

		this.isFitPlan_Group.add(this.cb_IsFitPlan_no);
		this.isFitPlan_Group.add(this.cb_IsFitPlan_yes);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		isFitPlan_Group = new javax.swing.ButtonGroup();
		isMoveIn_Group = new javax.swing.ButtonGroup();
		isFullTop_Group = new javax.swing.ButtonGroup();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		PANEL_LACPB = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		tf_m_Files_year = new javax.swing.JTextField();
		tf_m_Files_num = new javax.swing.JTextField();
		tf_m_Litigant_name = new javax.swing.JTextField();
		tf_m_Litigant_gender = new javax.swing.JTextField();
		tf_m_Litigant_age = new javax.swing.JTextField();
		tf_m_Litigant_ICaddr = new javax.swing.JTextField();
		tf_m_Litigant_ICcountry = new javax.swing.JTextField();
		tf_m_Litigant_PhoneNum = new javax.swing.JTextField();
		tf_m_Acceptance_Date = new javax.swing.JTextField();
		tf_m_Illegal_sites = new javax.swing.JTextField();
		jLabel11 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jLabel14 = new javax.swing.JLabel();
		CreateNewRegister = new javax.swing.JButton();
		jLabel15 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		tf_m_Litigant_nation = new javax.swing.JTextField();
		jLabel28 = new javax.swing.JLabel();
		jLabel29 = new javax.swing.JLabel();
		tf_Litigant_occupation = new javax.swing.JTextField();
		jLabel30 = new javax.swing.JLabel();
		tf_m_ICcard_num = new javax.swing.JTextField();
		jLabel27 = new javax.swing.JLabel();
		tf_m_LiveNow_addr = new javax.swing.JTextField();
		jLabel64 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel17 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jLabel21 = new javax.swing.JLabel();
		jLabel22 = new javax.swing.JLabel();
		jLabel23 = new javax.swing.JLabel();
		jLabel24 = new javax.swing.JLabel();
		jLabel25 = new javax.swing.JLabel();
		jLabel26 = new javax.swing.JLabel();
		jLabel31 = new javax.swing.JLabel();
		jLabel32 = new javax.swing.JLabel();
		tf_m_Inves_endDate = new javax.swing.JTextField();
		jLabel33 = new javax.swing.JLabel();
		jLabel34 = new javax.swing.JLabel();
		jLabel35 = new javax.swing.JLabel();
		tf_m_BeginBuild_date = new javax.swing.JTextField();
		jLabel36 = new javax.swing.JLabel();
		tf_m_EndBuild_date = new javax.swing.JTextField();
		tf_m_Building_floors = new javax.swing.JTextField();
		tf_m_Building_structure = new javax.swing.JTextField();
		tf_m_base_covers = new javax.swing.JTextField();
		tf_m_Building_covers = new javax.swing.JTextField();
		tf_m_Build_fund = new javax.swing.JTextField();
		tf_m_house_neighbor_E = new javax.swing.JTextField();
		jLabel37 = new javax.swing.JLabel();
		jLabel38 = new javax.swing.JLabel();
		tf_m_house_neighbor_W = new javax.swing.JTextField();
		jLabel39 = new javax.swing.JLabel();
		tf_m_house_neighbor_S = new javax.swing.JTextField();
		jLabel40 = new javax.swing.JLabel();
		tf_m_house_neighbor_N = new javax.swing.JTextField();
		CreateCaseReport = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		ta_m_Land_type_info = new javax.swing.JTextArea();
		jScrollPane2 = new javax.swing.JScrollPane();
		ta_m_Land_origin = new javax.swing.JTextArea();
		jLabel41 = new javax.swing.JLabel();
		jLabel42 = new javax.swing.JLabel();
		jLabel43 = new javax.swing.JLabel();
		jLabel44 = new javax.swing.JLabel();
		tf_m_Inves_beginDate = new javax.swing.JTextField();
		jLabel46 = new javax.swing.JLabel();
		tf_m_File_Date = new javax.swing.JTextField();
		jLabel47 = new javax.swing.JLabel();
		jLabel48 = new javax.swing.JLabel();
		tf_m_Handler1_name = new javax.swing.JTextField();
		jLabel49 = new javax.swing.JLabel();
		tf_m_Handler2_name = new javax.swing.JTextField();
		jLabel50 = new javax.swing.JLabel();
		jLabel51 = new javax.swing.JLabel();
		cb_IsFitPlan_yes = new javax.swing.JCheckBox();
		cb_IsFitPlan_no = new javax.swing.JCheckBox();
		cb_isFullTop_yes = new javax.swing.JCheckBox();
		cb_isFullTop_no = new javax.swing.JCheckBox();
		cb_isMoveIn_yes = new javax.swing.JCheckBox();
		cb_isMoveIn_no = new javax.swing.JCheckBox();
		jPanel3 = new javax.swing.JPanel();
		jLabel52 = new javax.swing.JLabel();
		jLabel53 = new javax.swing.JLabel();
		jLabel54 = new javax.swing.JLabel();
		jLabel55 = new javax.swing.JLabel();
		jLabel56 = new javax.swing.JLabel();
		tf_m_Meeting_date = new javax.swing.JTextField();
		tf_m_Land_town = new javax.swing.JTextField();
		tf_m_Land_town_director = new javax.swing.JTextField();
		tf_m_Fine = new javax.swing.JTextField();
		tf_m_Fine_bigWrite = new javax.swing.JTextField();
		jLabel57 = new javax.swing.JLabel();
		jLabel58 = new javax.swing.JLabel();
		jLabel59 = new javax.swing.JLabel();
		jLabel60 = new javax.swing.JLabel();
		bt_CreateCase_discution = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		bt_CreatePunish_DecideTable = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel61 = new javax.swing.JLabel();
		tf_m_inform_Date = new javax.swing.JTextField();
		bt_inform_Files_pre = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jLabel62 = new javax.swing.JLabel();
		tf_m_Decide_Date = new javax.swing.JTextField();
		bt_Punish_DecideFiles = new javax.swing.JButton();
		jLabel63 = new javax.swing.JLabel();
		tf_informSent_Date = new javax.swing.JTextField();
		jPanel7 = new javax.swing.JPanel();
		bt_Case_Ending = new javax.swing.JButton();
		jPanel8 = new javax.swing.JPanel();
		bt_create_confiscateTable = new javax.swing.JButton();
		bt_createPlanSituation_Explain = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u76d1\u5bdf-\u6751\u6c11\u5efa\u623f\u6848\u5377\u751f\u6210\u5668");
		setResizable(false);

		jLabel1.setText("\u6848\u5377\u5e74\u4efd");

		jLabel2.setText("\u6848\u5377\u7f16\u53f7");

		jLabel3.setText("\u5f53\u4e8b\u4eba\u6027\u522b");

		jLabel4.setText("\u5f53\u4e8b\u4eba\u59d3\u540d");

		jLabel5.setText("\u8eab\u4efd\u8bc1\u8be6\u7ec6\u5730\u5740");

		jLabel6.setText("\u5f53\u4e8b\u4eba\u5e74\u9f84");

		jLabel7.setText("\u5f53\u4e8b\u4eba\u7535\u8bdd");

		jLabel8.setText("\u8eab\u4efd\u8bc1\u6240\u5728\u6751");

		jLabel9.setText("\u8fdd\u6cd5\u5efa\u623f\u5730\u70b9");

		jLabel10.setText("\u7acb\u6848\u65f6\u95f4");

		tf_m_Files_year.setText("2017");

		tf_m_Files_num.setText("xxx");

		tf_m_Litigant_name.setText("mmm");

		tf_m_Litigant_gender.setText("\u7537xx");

		tf_m_Litigant_age.setText("age");

		tf_m_Litigant_ICaddr.setText("address");

		tf_m_Litigant_ICcountry.setText("countryside");

		tf_m_Litigant_PhoneNum.setText("telPhone");

		tf_m_Acceptance_Date.setText("accept_Date");

		tf_m_Illegal_sites.setText("illegal_sites");

		jLabel11.setText("\u5e74");

		jLabel12.setText("\u53f7");

		jLabel13.setFont(new java.awt.Font("微软雅黑", 0, 10));
		jLabel13.setForeground(new java.awt.Color(255, 0, 51));
		jLabel13.setText("\u4f8b\uff1a\u53e4\u7530\u53bf\u9e64\u5858\u9547\u540e\u5f70\u6751");

		jLabel14.setFont(new java.awt.Font("微软雅黑", 0, 10));
		jLabel14.setForeground(new java.awt.Color(255, 0, 51));
		jLabel14.setText("\u4f8b\uff1a\u53e4\u7530\u53bf\u9e64\u5858\u9547\u540e\u5f70\u6751\u201c\u5f69\u8679\u6865\u201d\u5730\u6bb5");

		CreateNewRegister.setText("\u521b\u5efa\u7acb\u6848\u5448\u6279\u8868");
		CreateNewRegister
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						CreateNewRegisterActionPerformed(evt);
					}
				});

		jLabel15.setFont(new java.awt.Font("微软雅黑", 0, 10));
		jLabel15.setForeground(new java.awt.Color(255, 0, 51));
		jLabel15.setText("\u4f8b\uff1a2017\u5e741\u67081\u65e5");

		jLabel16.setText("\u5c81");

		tf_m_Litigant_nation.setText("\u6c49xx");

		jLabel28.setText("\u6c11\u65cf");

		jLabel29.setText("\u804c\u4e1a");

		tf_Litigant_occupation.setText("\u519c\u6c11xx");

		jLabel30.setText("\u8eab\u4efd\u8bc1\u53f7\u7801");

		tf_m_ICcard_num.setText("35222719xxxxxxxxxx");

		jLabel27.setText("\u5f53\u4e8b\u4eba\u73b0\u4f4f\u5740");

		tf_m_LiveNow_addr.setText("liveNowAddr");

		jLabel64.setFont(new java.awt.Font("微软雅黑", 0, 10));
		jLabel64.setForeground(new java.awt.Color(255, 0, 51));
		jLabel64.setText("\u4f8b\uff1a\u53e4\u7530\u53bf\u9e64\u5858\u9547\u540e\u5f70\u67518\u53f7");

		javax.swing.GroupLayout PANEL_LACPBLayout = new javax.swing.GroupLayout(
				PANEL_LACPB);
		PANEL_LACPB.setLayout(PANEL_LACPBLayout);
		PANEL_LACPBLayout
				.setHorizontalGroup(PANEL_LACPBLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								PANEL_LACPBLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																CreateNewRegister,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																204,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																PANEL_LACPBLayout
																		.createSequentialGroup()
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel2,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel6,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel28,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel29,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel30,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel8,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel27,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel7,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel10,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel9,
																								javax.swing.GroupLayout.Alignment.TRAILING))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								tf_m_Litigant_name,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_gender,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_age,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_nation,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_Litigant_occupation,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_ICcard_num,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_ICcountry,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_LiveNow_addr,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_PhoneNum,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Acceptance_Date,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Litigant_ICaddr,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Files_num,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Files_year,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Illegal_sites,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								299,
																								Short.MAX_VALUE))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel11)
														.addComponent(jLabel12)
														.addComponent(jLabel16)
														.addComponent(jLabel13)
														.addComponent(
																jLabel15,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																97,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel14)
														.addComponent(jLabel64))
										.addGap(56, 56, 56)));
		PANEL_LACPBLayout
				.setVerticalGroup(PANEL_LACPBLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								PANEL_LACPBLayout
										.createSequentialGroup()
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																PANEL_LACPBLayout
																		.createSequentialGroup()
																		.addGap(51,
																				51,
																				51)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1)
																						.addComponent(
																								tf_m_Files_year,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel12)
																						.addComponent(
																								tf_m_Files_num,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								tf_m_Litigant_name,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								tf_m_Litigant_gender,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																PANEL_LACPBLayout
																		.createSequentialGroup()
																		.addGap(56,
																				56,
																				56)
																		.addComponent(
																				jLabel11)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6)
														.addComponent(
																tf_m_Litigant_age,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel16))
										.addGap(9, 9, 9)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																tf_m_Litigant_nation,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel28))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel29)
														.addComponent(
																tf_Litigant_occupation,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																tf_m_ICcard_num,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel30))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5)
														.addGroup(
																PANEL_LACPBLayout
																		.createSequentialGroup()
																		.addGap(2,
																				2,
																				2)
																		.addComponent(
																				tf_m_Litigant_ICaddr,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				PANEL_LACPBLayout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								tf_m_Litigant_ICcountry,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel8)
																						.addComponent(
																								jLabel13))))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel27)
														.addComponent(
																tf_m_LiveNow_addr,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel64))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																tf_m_Litigant_PhoneNum))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																23,
																Short.MAX_VALUE)
														.addComponent(
																tf_m_Acceptance_Date)
														.addComponent(jLabel15))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												PANEL_LACPBLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9)
														.addComponent(jLabel14)
														.addComponent(
																tf_m_Illegal_sites))
										.addGap(69, 69, 69)
										.addComponent(
												CreateNewRegister,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(216, 216, 216)));

		jTabbedPane1.addTab("\u7acb\u6848\u5448\u6279\u8868", PANEL_LACPB);
		PANEL_LACPB.getAccessibleContext().setAccessibleName("");
		PANEL_LACPB.getAccessibleContext().setAccessibleDescription("");

		jLabel17.setText("\u8c03\u67e5\u65f6\u95f4");

		jLabel18.setText("\u5f00\u59cb\u5efa\u623f\u65f6\u95f4");

		jLabel19.setText("\u5b8c\u6210\u5efa\u623f\u65f6\u95f4");

		jLabel20.setText("\u623f\u5c4b\u5c42\u6570");

		jLabel21.setText("\u623f\u5c4b\u7ed3\u6784");

		jLabel22.setText("\u571f\u5730\u6765\u6e90\u63cf\u8ff0");

		jLabel23.setText("\u6295\u5165\u8d44\u91d1\u6216\u5176\u4ed6");

		jLabel24.setText("\u5efa\u7b51\u9762\u79ef");

		jLabel25.setText("\u5730\u7c7b\u4fe1\u606f\u63cf\u8ff0");

		jLabel26.setText("\u5360\u5730\u9762\u79ef");

		jLabel31.setForeground(new java.awt.Color(255, 0, 0));
		jLabel31.setText("x\u6708x\u65e5)");

		jLabel32.setText("\u2014");

		tf_m_Inves_endDate.setText("x\u6708x\u65e5");

		jLabel33.setForeground(new java.awt.Color(255, 0, 51));
		jLabel33.setText("x\u6708x\u65e5)");

		jLabel34.setText("\u56db\u81f3\uff1a");

		jLabel35.setText("\u662f\u5426\u7b26\u5408\u603b\u4f53\u89c4\u5212");

		tf_m_BeginBuild_date.setText("20xx\u5e74x\u6708");

		jLabel36.setForeground(new java.awt.Color(255, 0, 51));
		jLabel36.setText("(x\u5e74x\u6708)");

		tf_m_EndBuild_date.setText("20xx\u5e74x\u6708");

		tf_m_Building_floors.setText("xxxx");

		tf_m_Building_structure.setText("xx\u7816\u6df7xx");

		tf_m_base_covers.setText("xxxx");

		tf_m_Building_covers.setText("xxxxx");

		tf_m_Build_fund
				.setText("\u623f\u5c4b\u5efa\u8bbe\u6295\u5165\u8d44\u91d1\u7ea618\u4e07\u5143\u3002");

		tf_m_house_neighbor_E.setText("xxx");

		jLabel37.setText("\u4e1c\u9762\u662f");

		jLabel38.setText("\u897f\u9762\u662f");

		tf_m_house_neighbor_W.setText("xxx");

		jLabel39.setText("\u5357\u9762\u662f");

		tf_m_house_neighbor_S.setText("xxx");

		jLabel40.setText("\u5317\u9762\u662f");

		tf_m_house_neighbor_N.setText("xxx");

		CreateCaseReport.setText("\u521b\u5efa\u8c03\u67e5\u62a5\u544a");
		CreateCaseReport.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				CreateCaseReportActionPerformed(evt);
			}
		});

		ta_m_Land_type_info.setColumns(20);
		ta_m_Land_type_info.setLineWrap(true);
		ta_m_Land_type_info.setRows(5);
		ta_m_Land_type_info
				.setText("\u5176\u4e2d\u6c34\u7530xxxx\u5e73\u65b9\u7c73\uff0c\u65f1\u5730xxxx\u5e73\u65b9\u7c73\uff0c\u5efa\u5236\u9547xxxx\u5e73\u65b9\u7c73");
		jScrollPane1.setViewportView(ta_m_Land_type_info);

		ta_m_Land_origin.setColumns(20);
		ta_m_Land_origin.setLineWrap(true);
		ta_m_Land_origin.setRows(5);
		ta_m_Land_origin
				.setText("\u5efa\u623f\u7684\u571f\u5730\u662fxxx\u6751\u96c6\u4f53\u571f\u5730\uff0cyyy\u5e74xx\u6708xx\u65e5mmm\u5411xxx\u6751\u6751\u6c11\u59d4\u5458\u4f1a\u7f34\u7eb3\u4e09\u901a\u4e00\u5e73\u6b3e\u4eba\u6c11\u5e01xxxx\u4e07\u5143");
		jScrollPane2.setViewportView(ta_m_Land_origin);

		jLabel41.setForeground(new java.awt.Color(255, 0, 51));
		jLabel41.setText("(x\u5e74x\u6708)");

		jLabel42.setText("\u5c42");

		jLabel43.setText("\u5e73\u65b9\u7c73");

		jLabel44.setText("\u5e73\u65b9\u7c73");

		tf_m_Inves_beginDate.setText("x\u6708x\u65e5");

		jLabel46.setText("\u843d\u6b3e\u65f6\u95f4");

		tf_m_File_Date
				.setText("\u4e8c\u3007\u4e00\u4e03\u5e74xxx\u6708xxx\u65e5");

		jLabel47.setForeground(new java.awt.Color(255, 0, 51));
		jLabel47.setText("(\u4f8b\uff1a\u4e8c\u3007\u4e00\u4e03\u5e74\u5341\u6708\u5341\u516b\u65e5)");

		jLabel48.setText("\u6848\u4ef6\u627f\u529e\u4eba1");

		tf_m_Handler1_name.setText("handler1");

		jLabel49.setText("\u6848\u4ef6\u627f\u529e\u4eba2");

		tf_m_Handler2_name.setText("handler2");

		jLabel50.setText("\u662f\u5426\u5c01\u9876");

		jLabel51.setText("\u662f\u5426\u5165\u4f4f");

		cb_IsFitPlan_yes.setSelected(true);
		cb_IsFitPlan_yes.setText("\u7b26\u5408");

		cb_IsFitPlan_no.setText("\u4e0d\u7b26\u5408");

		cb_isFullTop_yes.setSelected(true);
		cb_isFullTop_yes.setText("\u662f");

		cb_isFullTop_no.setText("\u5426");

		cb_isMoveIn_yes.setSelected(true);
		cb_isMoveIn_yes.setText("\u662f");

		cb_isMoveIn_no.setText("\u5426");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel35)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				cb_IsFitPlan_yes)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				cb_IsFitPlan_no))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel22,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								84,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel19,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel18,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel50,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel17,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel20,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel21,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel26,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel25,
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								72,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel24,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel34)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												12,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel37))
																						.addComponent(
																								jLabel48,
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel23,
																								javax.swing.GroupLayout.Alignment.TRAILING))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addGroup(
																																								jPanel2Layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												tf_m_house_neighbor_E,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												60,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addGap(18,
																																												18,
																																												18)
																																										.addComponent(
																																												jLabel38)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												tf_m_house_neighbor_W,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												60,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																												9,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jLabel39)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												tf_m_house_neighbor_S,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												60,
																																												javax.swing.GroupLayout.PREFERRED_SIZE)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																										.addComponent(
																																												jLabel40)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												tf_m_house_neighbor_N,
																																												javax.swing.GroupLayout.PREFERRED_SIZE,
																																												60,
																																												javax.swing.GroupLayout.PREFERRED_SIZE))
																																						.addComponent(
																																								tf_m_EndBuild_date,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_BeginBuild_date,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jScrollPane2,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_Build_fund,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_Building_covers,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								jScrollPane1,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_base_covers,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_Building_structure,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addComponent(
																																								tf_m_Building_floors,
																																								javax.swing.GroupLayout.DEFAULT_SIZE,
																																								402,
																																								Short.MAX_VALUE)
																																						.addGroup(
																																								jPanel2Layout
																																										.createSequentialGroup()
																																										.addGap(10,
																																												10,
																																												10)
																																										.addComponent(
																																												cb_isFullTop_yes)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												cb_isFullTop_no)
																																										.addGap(74,
																																												74,
																																												74)
																																										.addComponent(
																																												jLabel51)
																																										.addGap(18,
																																												18,
																																												18)
																																										.addComponent(
																																												cb_isMoveIn_yes)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																										.addComponent(
																																												cb_isMoveIn_no)))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel44)
																																						.addComponent(
																																								jLabel43)
																																						.addComponent(
																																								jLabel36)
																																						.addComponent(
																																								jLabel42)
																																						.addComponent(
																																								jLabel41)))
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				tf_m_Inves_beginDate,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				136,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																																		.addComponent(
																																				jLabel31)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel32)
																																		.addGap(18,
																																				18,
																																				18)
																																		.addComponent(
																																				tf_m_Inves_endDate,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				123,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addGap(18,
																																				18,
																																				18)
																																		.addComponent(
																																				jLabel33)))
																										.addGap(18,
																												18,
																												18))
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												tf_m_Handler1_name,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												158,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(43,
																												43,
																												43)
																										.addComponent(
																												jLabel49)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																										.addComponent(
																												tf_m_Handler2_name,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												148,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))))
										.addGap(76, 76, 76))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(149, 149, 149)
										.addComponent(
												CreateCaseReport,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												275,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(217, Short.MAX_VALUE))
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(40, 40, 40)
										.addComponent(jLabel46)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												tf_m_File_Date,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												136, Short.MAX_VALUE)
										.addGap(18, 18, 18)
										.addComponent(jLabel47)
										.addGap(235, 235, 235)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel48)
														.addComponent(
																tf_m_Handler1_name,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel49)
														.addComponent(
																tf_m_Handler2_name,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel17,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																17,
																Short.MAX_VALUE)
														.addComponent(
																tf_m_Inves_beginDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel31)
														.addComponent(jLabel32)
														.addComponent(
																tf_m_Inves_endDate,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel33))
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								tf_m_BeginBuild_date,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel36)
																						.addComponent(
																								jLabel18,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								tf_m_EndBuild_date,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel19,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)))
														.addComponent(jLabel41))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel20,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Building_floors))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel21,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Building_structure,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel50)
																						.addComponent(
																								cb_isFullTop_yes)
																						.addComponent(
																								cb_isFullTop_no)
																						.addComponent(
																								jLabel51)
																						.addComponent(
																								cb_isMoveIn_yes)
																						.addComponent(
																								cb_isMoveIn_no))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel26,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_base_covers,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel43))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel25,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								106,
																								Short.MAX_VALUE)
																						.addComponent(
																								jScrollPane1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel24,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)
																						.addComponent(
																								tf_m_Building_covers,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel44))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								tf_m_Build_fund,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel23,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jScrollPane2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								120,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel22))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel34,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								17,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel37)
																						.addComponent(
																								tf_m_house_neighbor_E,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								tf_m_house_neighbor_N,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel40)
																						.addComponent(
																								tf_m_house_neighbor_S,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel39)
																						.addComponent(
																								tf_m_house_neighbor_W,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel38))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel35)
																						.addComponent(
																								cb_IsFitPlan_yes)
																						.addComponent(
																								cb_IsFitPlan_no))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel46)
																						.addComponent(
																								tf_m_File_Date,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel47))
																		.addGap(22,
																				22,
																				22)
																		.addComponent(
																				CreateCaseReport,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				48,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(62,
																				62,
																				62))
														.addComponent(jLabel42))));

		jTabbedPane1.addTab("\u8c03\u67e5\u62a5\u544a", jPanel2);

		jLabel52.setText("\u8ba8\u8bba\u65f6\u95f4");

		jLabel53.setText("\u8fdd\u6cd5\u5730\u6240\u5728\u4e61\u9547");

		jLabel54.setText("\u8fdd\u6cd5\u5730\u4e61\u9547\u6240\u957f");

		jLabel55.setText("\u7f5a\u6b3e\u91d1\u989d");

		jLabel56.setText("\u7f5a\u6b3e\u91d1\u989d\u5927\u5199");

		tf_m_Meeting_date.setText("xxx\u6708xxx\u65e5");

		tf_m_Land_town.setText("\u5927\u7532\u9547xx");

		tf_m_Land_town_director.setText("xxx");

		tf_m_Fine.setText("1234");

		tf_m_Fine_bigWrite
				.setText("\u58f9\u4edf\u8d30\u4f70\u53c1\u62fe\u8086xxx");

		jLabel57.setForeground(new java.awt.Color(255, 0, 0));
		jLabel57.setText("(x\u6708x\u65e5)");

		jLabel58.setForeground(new java.awt.Color(255, 0, 0));
		jLabel58.setText("\u9547");

		jLabel59.setForeground(new java.awt.Color(255, 0, 0));
		jLabel59.setText("\u5143");

		jLabel60.setForeground(new java.awt.Color(255, 0, 0));
		jLabel60.setText("\u5143");

		bt_CreateCase_discution.setText("\u751f\u6210\u6848\u4ef6\u8ba8\u8bba");
		bt_CreateCase_discution
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_CreateCase_discutionActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(74, 74, 74)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																bt_CreateCase_discution,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																166,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel52)
																						.addComponent(
																								jLabel54)
																						.addComponent(
																								jLabel55)
																						.addComponent(
																								jLabel56)
																						.addComponent(
																								jLabel53,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								84,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								tf_m_Meeting_date)
																						.addComponent(
																								tf_m_Fine_bigWrite)
																						.addComponent(
																								tf_m_Fine)
																						.addComponent(
																								tf_m_Land_town_director)
																						.addComponent(
																								tf_m_Land_town,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								264,
																								Short.MAX_VALUE))))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel57)
														.addComponent(jLabel58)
														.addComponent(jLabel59)
														.addComponent(jLabel60))
										.addContainerGap(152, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(94, 94, 94)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																tf_m_Meeting_date,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel52)
														.addComponent(jLabel57))
										.addGap(32, 32, 32)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																tf_m_Land_town,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel53)
														.addComponent(jLabel58))
										.addGap(32, 32, 32)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel54)
														.addComponent(
																tf_m_Land_town_director,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(34, 34, 34)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel55)
														.addComponent(
																tf_m_Fine,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel59))
										.addGap(31, 31, 31)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																tf_m_Fine_bigWrite,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel56)
														.addComponent(jLabel60))
										.addGap(71, 71, 71)
										.addComponent(
												bt_CreateCase_discution,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												60,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(338, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u6848\u4ef6\u8ba8\u8bba", jPanel3);

		bt_CreatePunish_DecideTable
				.setText("\u751f\u6210\u5904\u7406\u51b3\u5b9a\u5448\u6279\u8868");
		bt_CreatePunish_DecideTable
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_CreatePunish_DecideTableActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout
						.createSequentialGroup()
						.addGap(179, 179, 179)
						.addComponent(bt_CreatePunish_DecideTable,
								javax.swing.GroupLayout.PREFERRED_SIZE, 238,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(224, Short.MAX_VALUE)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout
						.createSequentialGroup()
						.addGap(196, 196, 196)
						.addComponent(bt_CreatePunish_DecideTable,
								javax.swing.GroupLayout.PREFERRED_SIZE, 83,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(528, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5904\u7406\u51b3\u5b9a\u5448\u6279", jPanel4);

		jLabel61.setText("\u544a\u77e5\u4e66\u65f6\u95f4");

		tf_m_inform_Date
				.setText("\u4e8c\u3007\u4e00\u4e03\u5e74xxx\u6708xxx\u65e5");

		bt_inform_Files_pre
				.setText("\u521b\u5efa\u544a\u77e5\u4e66\u6587\u7a3f\u548c\u544a\u77e5\u4e66");
		bt_inform_Files_pre
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_inform_Files_preActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(138, 138, 138)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																bt_inform_Files_pre,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel61)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																		.addComponent(
																				tf_m_inform_Date,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				219,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(212, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(145, 145, 145)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel61)
														.addComponent(
																tf_m_inform_Date,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(114, 114, 114)
										.addComponent(
												bt_inform_Files_pre,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												92,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(433, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u544a\u77e5\u4e66", jPanel5);

		jLabel62.setText("\u51b3\u5b9a\u4e66\u65f6\u95f4");

		tf_m_Decide_Date
				.setText("\u4e8c\u3007\u4e00\u4e03\u5e74xxx\u6708xxx\u65e5");

		bt_Punish_DecideFiles
				.setText("\u521b\u5efa\u51b3\u5b9a\u4e66\u6587\u7a3f\u548c\u51b3\u5b9a\u4e66");
		bt_Punish_DecideFiles
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_Punish_DecideFilesActionPerformed(evt);
					}
				});

		jLabel63.setText("\u544a\u77e5\u4e66\u9001\u8fbe\u65f6\u95f4");

		tf_informSent_Date.setText("2017\u5e74xxx\u6708xxx\u65e5");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(144, 144, 144)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																bt_Punish_DecideFiles,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																329,
																Short.MAX_VALUE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																jPanel6Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel63)
																						.addComponent(
																								jLabel62))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanel6Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								tf_informSent_Date)
																						.addComponent(
																								tf_m_Decide_Date,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								227,
																								Short.MAX_VALUE))))
										.addContainerGap(168, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(102, 102, 102)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel63)
														.addComponent(
																tf_informSent_Date,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel62)
														.addComponent(
																tf_m_Decide_Date,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(97, 97, 97)
										.addComponent(
												bt_Punish_DecideFiles,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												97,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(428, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u51b3\u5b9a\u4e66", jPanel6);

		bt_Case_Ending.setText("\u751f\u6210\u7ed3\u6848\u5448\u6279\u8868");
		bt_Case_Ending.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bt_Case_EndingActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel7Layout
						.createSequentialGroup()
						.addGap(226, 226, 226)
						.addComponent(bt_Case_Ending,
								javax.swing.GroupLayout.PREFERRED_SIZE, 190,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(225, Short.MAX_VALUE)));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel7Layout
						.createSequentialGroup()
						.addGap(147, 147, 147)
						.addComponent(bt_Case_Ending,
								javax.swing.GroupLayout.PREFERRED_SIZE, 88,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(572, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u7ed3\u6848\u5448\u6279\u8868", jPanel7);

		bt_create_confiscateTable
				.setText("\u6ca1\u6536\u8d22\u52a1\u6e05\u5355");
		bt_create_confiscateTable
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_create_confiscateTableActionPerformed(evt);
					}
				});

		bt_createPlanSituation_Explain
				.setText("\u89c4\u5212\u60c5\u51b5\u8bf4\u660e/\u5b97\u5730\u60c5\u51b5\u8bf4\u660e");
		bt_createPlanSituation_Explain
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						bt_createPlanSituation_ExplainActionPerformed(evt);
					}
				});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout
				.setHorizontalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(177, 177, 177)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																bt_createPlanSituation_Explain,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																bt_create_confiscateTable,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																212,
																Short.MAX_VALUE))
										.addContainerGap(252, Short.MAX_VALUE)));
		jPanel8Layout.setVerticalGroup(jPanel8Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel8Layout
						.createSequentialGroup()
						.addGap(66, 66, 66)
						.addComponent(bt_create_confiscateTable,
								javax.swing.GroupLayout.PREFERRED_SIZE, 64,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(29, 29, 29)
						.addComponent(bt_createPlanSituation_Explain,
								javax.swing.GroupLayout.PREFERRED_SIZE, 58,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(590, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u5176\u4ed6", jPanel8);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/*创建规划情况说明、宗地情况说明按钮事件*/
	private void bt_createPlanSituation_ExplainActionPerformed(
			java.awt.event.ActionEvent evt) {

		File_Operation.Create_plan_situate(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "规划情况说明、宗地情况说明创建完成");
	}

	/*创建没收财物清单按钮事件*/
	private void bt_create_confiscateTableActionPerformed(
			java.awt.event.ActionEvent evt) {

		File_Operation.Create_confiscate_Table(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "没收财物清单创建完成");
	}

	/*创建结案呈批表*/
	private void bt_Case_EndingActionPerformed(java.awt.event.ActionEvent evt) {

		file_other_info.setM_Acceptance_Date(this.tf_m_Acceptance_Date
				.getText());//获取受理日期
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());//获取案卷年份
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());//获取案卷编号

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_PhoneNum(this.tf_m_Litigant_PhoneNum
				.getText());/* 获取当事人电话 */

		building_info.setM_BeginBuild_date(this.tf_m_BeginBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_EndBuild_date(this.tf_m_EndBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Building_floors(this.tf_m_Building_floors.getText());/* 房屋层数 */
		building_info.setM_Building_structure(this.tf_m_Building_structure
				.getText());/* 房屋结构 */

		building_info.setM_isFitPlan(this.cb_isFullTop_yes.isSelected() ? "已封顶"
				: (this.cb_isFullTop_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_isFitPlan(this.cb_isMoveIn_yes.isSelected() ? "已封顶"
				: (this.cb_isMoveIn_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */

		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */
		building_info.setM_Land_type_info(this.ta_m_Land_type_info.getText());/* 地类文本信息 */
		building_info.setM_Building_covers(this.tf_m_Building_covers.getText());/* 建筑面积 */

		File_Other_Info.m_Fine = Integer.parseInt(this.tf_m_Fine.getText());/* 获取罚款金额 */

		File_Other_Info.m_Fine_bigWrite = this.tf_m_Fine_bigWrite.getText();/* 获取罚款金额大写 */

		File_Operation.Create_Case_Ending(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "结案呈批表创建完成");
	}

	/*创建决定书文稿和决定书*/
	private void bt_Punish_DecideFilesActionPerformed(
			java.awt.event.ActionEvent evt) {

		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());//获取案卷年份
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());//获取案卷编号
		file_other_info.setM_inform_Date(this.tf_informSent_Date.getText());/* 告知书送达时间 */
		file_other_info.setM_Decide_Date(this.tf_m_Decide_Date.getText());/* 决定书落款时间 */

		building_info.setM_BeginBuild_date(this.tf_m_BeginBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_EndBuild_date(this.tf_m_EndBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Building_floors(this.tf_m_Building_floors.getText());/* 房屋层数 */
		building_info.setM_Building_structure(this.tf_m_Building_structure
				.getText());/* 房屋结构 */

		building_info.setM_isFitPlan(this.cb_isFullTop_yes.isSelected() ? "已封顶"
				: (this.cb_isFullTop_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_isFitPlan(this.cb_isMoveIn_yes.isSelected() ? "已封顶"
				: (this.cb_isMoveIn_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */

		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */
		building_info.setM_Land_type_info(this.ta_m_Land_type_info.getText());/* 地类文本信息 */
		building_info.setM_Building_covers(this.tf_m_Building_covers.getText());/* 建筑面积 */
		building_info.setM_house_neighbor_N(this.tf_m_house_neighbor_N
				.getText());/* 房屋四至_北 */
		building_info.setM_house_neighbor_S(this.tf_m_house_neighbor_S
				.getText());/* 房屋四至_南 */
		building_info.setM_house_neighbor_E(this.tf_m_house_neighbor_E
				.getText());/* 房屋四至_东 */
		building_info.setM_house_neighbor_W(this.tf_m_house_neighbor_W
				.getText());/* 房屋四至_西 */
		building_info.setM_isFitPlan(this.cb_IsFitPlan_yes.isSelected() ? "符合"
				: (this.cb_IsFitPlan_no.isSelected() ? "不符合" : null));/* 是否符合土地利用总体规划 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_gender(this.tf_m_Litigant_gender.getText());/* 获取当事人性别 */
		litigant_info.setM_Litigant_age(this.tf_m_Litigant_age.getText());/* 获取当事人年龄 */
		litigant_info.setM_Litigant_nation(this.tf_m_Litigant_nation.getText());/* 获取当事人民族 */
		litigant_info.setM_Litigant_occupation(this.tf_Litigant_occupation
				.getText());/* 获取当事人职业 */
		litigant_info.setM_LiveNow_addr(this.tf_m_LiveNow_addr.getText());/* 获取当事人现住址 */
		litigant_info.setM_ICcard_num(this.tf_m_ICcard_num.getText());/* 获取当事人身份证号码 */
		litigant_info.setM_Litigant_ICaddr(this.tf_m_Litigant_ICaddr.getText());/* 获取当事人身份证详细地址 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人身份证所在村 */
		litigant_info.setM_Litigant_PhoneNum(this.tf_m_Litigant_PhoneNum
				.getText());/* 获取当事人电话 */

		File_Other_Info.m_Fine = Integer.parseInt(this.tf_m_Fine.getText());/* 获取罚款金额 */

		File_Other_Info.m_Fine_bigWrite = this.tf_m_Fine_bigWrite.getText();/* 获取罚款金额大写 */

		File_Operation.Create_punish_DecideFiles(building_info,
				file_other_info, litigant_info);

		JOptionPane.showMessageDialog(null, "决定书和文稿创建完成");
	}

	/*创建告知书文稿和告知书*/
	private void bt_inform_Files_preActionPerformed(
			java.awt.event.ActionEvent evt) {
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());//获取案卷年份
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());//获取案卷编号
		file_other_info.setM_inform_Date(this.tf_m_inform_Date.getText());/* 告知书落款时间 */

		building_info.setM_BeginBuild_date(this.tf_m_BeginBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_EndBuild_date(this.tf_m_EndBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Building_floors(this.tf_m_Building_floors.getText());/* 房屋层数 */
		building_info.setM_Building_structure(this.tf_m_Building_structure
				.getText());/* 房屋结构 */

		building_info.setM_isFitPlan(this.cb_isFullTop_yes.isSelected() ? "已封顶"
				: (this.cb_isFullTop_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_isFitPlan(this.cb_isMoveIn_yes.isSelected() ? "已封顶"
				: (this.cb_isMoveIn_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */

		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */
		building_info.setM_Land_type_info(this.ta_m_Land_type_info.getText());/* 地类文本信息 */
		building_info.setM_Building_covers(this.tf_m_Building_covers.getText());/* 建筑面积 */
		building_info.setM_house_neighbor_N(this.tf_m_house_neighbor_N
				.getText());/* 房屋四至_北 */
		building_info.setM_house_neighbor_S(this.tf_m_house_neighbor_S
				.getText());/* 房屋四至_南 */
		building_info.setM_house_neighbor_E(this.tf_m_house_neighbor_E
				.getText());/* 房屋四至_东 */
		building_info.setM_house_neighbor_W(this.tf_m_house_neighbor_W
				.getText());/* 房屋四至_西 */
		building_info.setM_isFitPlan(this.cb_IsFitPlan_yes.isSelected() ? "符合"
				: (this.cb_IsFitPlan_no.isSelected() ? "不符合" : null));/* 是否符合土地利用总体规划 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_gender(this.tf_m_Litigant_gender.getText());/* 获取当事人性别 */
		litigant_info.setM_Litigant_age(this.tf_m_Litigant_age.getText());/* 获取当事人年龄 */
		litigant_info.setM_Litigant_nation(this.tf_m_Litigant_nation.getText());/* 获取当事人民族 */
		litigant_info.setM_Litigant_occupation(this.tf_Litigant_occupation
				.getText());/* 获取当事人职业 */
		litigant_info.setM_LiveNow_addr(this.tf_m_LiveNow_addr.getText());/* 获取当事人现住址 */
		litigant_info.setM_ICcard_num(this.tf_m_ICcard_num.getText());/* 获取当事人身份证号码 */
		litigant_info.setM_Litigant_ICaddr(this.tf_m_Litigant_ICaddr.getText());/* 获取当事人身份证详细地址 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人身份证所在村 */
		litigant_info.setM_Litigant_PhoneNum(this.tf_m_Litigant_PhoneNum
				.getText());/* 获取当事人电话 */

		File_Other_Info.m_Fine = Integer.parseInt(this.tf_m_Fine.getText());/* 获取罚款金额 */

		File_Other_Info.m_Fine_bigWrite = this.tf_m_Fine_bigWrite.getText();/* 获取罚款金额大写 */

		File_Operation.Create_inform_Files(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "告知书和文稿创建完成");
	}

	/* 创建处理决定呈批表 */
	private void bt_CreatePunish_DecideTableActionPerformed(
			java.awt.event.ActionEvent evt) {

		/* 创建处理决定呈批表按钮事件 */
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());/* 获取案卷年份 */
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());/* 获取案卷编号 */
		file_other_info.setM_Acceptance_Date(this.tf_m_Acceptance_Date
				.getText());/* 获取受理日期 */
		file_other_info.setM_Inves_beginDate(this.tf_m_Inves_beginDate
				.getText());/* 获取调查起始时间 */
		file_other_info.setM_Inves_endDate(this.tf_m_Inves_endDate.getText());/* 获取调查终止时间 */

		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人所在村 */

		File_Other_Info.m_Fine = Integer.parseInt(this.tf_m_Fine.getText());/* 获取罚款金额 */

		File_Other_Info.m_Fine_bigWrite = this.tf_m_Fine_bigWrite.getText();/* 获取罚款金额大写 */

		File_Operation.Create_punish_DecideTable(building_info,
				file_other_info, litigant_info);

		JOptionPane.showMessageDialog(null, "处理决定呈批表创建完成");
	}

	/* 创建案件讨论 */
	private void bt_CreateCase_discutionActionPerformed(
			java.awt.event.ActionEvent evt) {

		/* 创建案件天伦按钮事件 */
		file_other_info.setM_Meeting_date(this.tf_m_Meeting_date.getText());//获取案卷年份
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());//获取案卷年份
		file_other_info.setM_Handler1_name(this.tf_m_Handler1_name.getText());/* 获取承办人1 */
		file_other_info.setM_Handler2_name(this.tf_m_Handler2_name.getText());/* 获取承办人2 */
		file_other_info.setM_Land_town(this.tf_m_Land_town.getText());//获取违法地点所在乡镇
		file_other_info.setM_Land_town_director(this.tf_m_Land_town_director
				.getText());//获取违法地点所在乡镇所长

		building_info.setM_BeginBuild_date(this.tf_m_BeginBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_EndBuild_date(this.tf_m_EndBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Building_floors(this.tf_m_Building_floors.getText());/* 房屋层数 */
		building_info.setM_Building_structure(this.tf_m_Building_structure
				.getText());/* 房屋结构 */
		building_info.setM_isFitPlan(this.cb_isFullTop_yes.isSelected() ? "已封顶"
				: (this.cb_isFullTop_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_isFitPlan(this.cb_isMoveIn_yes.isSelected() ? "已封顶"
				: (this.cb_isMoveIn_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */
		building_info.setM_Land_type_info(this.ta_m_Land_type_info.getText());/* 地类文本信息 */
		building_info.setM_Building_covers(this.tf_m_Building_covers.getText());/* 建筑面积 */
		building_info.setM_Build_fund(this.tf_m_Build_fund.getText());/* 建设投入资金 */
		building_info.setM_Land_origin(this.ta_m_Land_origin.getText());/* 土地来源 */
		building_info.setM_house_neighbor_N(this.tf_m_house_neighbor_N
				.getText());/* 房屋四至_北 */
		building_info.setM_house_neighbor_S(this.tf_m_house_neighbor_S
				.getText());/* 房屋四至_南 */
		building_info.setM_house_neighbor_E(this.tf_m_house_neighbor_E
				.getText());/* 房屋四至_东 */
		building_info.setM_house_neighbor_W(this.tf_m_house_neighbor_W
				.getText());/* 房屋四至_西 */
		building_info.setM_isFitPlan(this.cb_IsFitPlan_yes.isSelected() ? "符合"
				: (this.cb_IsFitPlan_no.isSelected() ? "不符合" : null));/* 是否符合土地利用总体规划 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人身份证所在村 */

		//File_Other_Info.m_Fine=(int)(Float.parseFloat(this.tf_m_base_covers.getText())*19);
		File_Other_Info.m_Fine = Integer.parseInt(this.tf_m_Fine.getText());/* 获取罚款金额 */

		File_Other_Info.m_Fine_bigWrite = this.tf_m_Fine_bigWrite.getText();/* 获取罚款金额大写 */

		/*调用函数创建文件*/
		File_Operation.Create_Case_discution(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "案件讨论创建完成");
	}

	/* 创建案件调查报告 */
	private void CreateCaseReportActionPerformed(java.awt.event.ActionEvent evt) {

		/* 创建调查报告按钮事件 */
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());//获取案卷年份
		file_other_info.setM_Inves_beginDate(this.tf_m_Inves_beginDate
				.getText());/* 获取调查起始时间 */
		file_other_info.setM_Inves_endDate(this.tf_m_Inves_endDate.getText());/* 获取调查终止时间 */
		file_other_info.setM_Handler1_name(this.tf_m_Handler1_name.getText());/* 获取承办人1 */
		file_other_info.setM_Handler2_name(this.tf_m_Handler2_name.getText());/* 获取承办人2 */
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());/* 获取案卷编号 */
		file_other_info.setM_Acceptance_Date(this.tf_m_Acceptance_Date
				.getText());/* 获取受理日期 */
		file_other_info.setM_File_Date(this.tf_m_File_Date.getText());/* 调查报告落款时间 */

		building_info.setM_BeginBuild_date(this.tf_m_BeginBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */
		building_info.setM_EndBuild_date(this.tf_m_EndBuild_date.getText());/* 获取开始建房时间 */
		building_info.setM_Building_floors(this.tf_m_Building_floors.getText());/* 房屋层数 */
		building_info.setM_Building_structure(this.tf_m_Building_structure
				.getText());/* 房屋结构 */

		building_info.setM_isFitPlan(this.cb_isFullTop_yes.isSelected() ? "已封顶"
				: (this.cb_isFullTop_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */
		building_info.setM_isFitPlan(this.cb_isMoveIn_yes.isSelected() ? "已封顶"
				: (this.cb_isMoveIn_no.isSelected() ? "未封顶" : "xxxx"));/* 是否封顶 */

		building_info.setM_base_covers(this.tf_m_base_covers.getText());/* 占地面积 */
		building_info.setM_Land_type_info(this.ta_m_Land_type_info.getText());/* 地类文本信息 */
		building_info.setM_Building_covers(this.tf_m_Building_covers.getText());/* 建筑面积 */
		building_info.setM_Build_fund(this.tf_m_Build_fund.getText());/* 建设投入资金 */
		building_info.setM_Land_origin(this.ta_m_Land_origin.getText());/* 土地来源 */
		building_info.setM_house_neighbor_N(this.tf_m_house_neighbor_N
				.getText());/* 房屋四至_北 */
		building_info.setM_house_neighbor_S(this.tf_m_house_neighbor_S
				.getText());/* 房屋四至_南 */
		building_info.setM_house_neighbor_E(this.tf_m_house_neighbor_E
				.getText());/* 房屋四至_东 */
		building_info.setM_house_neighbor_W(this.tf_m_house_neighbor_W
				.getText());/* 房屋四至_西 */

		building_info.setM_isFitPlan(this.cb_IsFitPlan_yes.isSelected() ? "符合"
				: (this.cb_IsFitPlan_no.isSelected() ? "不符合" : null));/* 是否符合土地利用总体规划 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_gender(this.tf_m_Litigant_gender.getText());/* 获取当事人性别 */
		litigant_info.setM_Litigant_age(this.tf_m_Litigant_age.getText());/* 获取当事人年龄 */
		litigant_info.setM_Litigant_nation(this.tf_m_Litigant_nation.getText());/* 获取当事人民族 */
		litigant_info.setM_Litigant_occupation(this.tf_Litigant_occupation
				.getText());/* 获取当事人职业 */
		litigant_info.setM_LiveNow_addr(this.tf_m_LiveNow_addr.getText());/* 获取当事人现住址 */
		litigant_info.setM_ICcard_num(this.tf_m_ICcard_num.getText());/* 获取当事人身份证号码 */
		litigant_info.setM_Litigant_ICaddr(this.tf_m_Litigant_ICaddr.getText());/* 获取当事人身份证详细地址 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人身份证所在村 */
		litigant_info.setM_Litigant_PhoneNum(this.tf_m_Litigant_PhoneNum
				.getText());/* 获取当事人电话 */

		File_Operation.Create_Case_Report(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "调查报告创建完成");
		// TODO add your handling code here:
	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/* 创建立案呈批表按钮事件 */
	private void CreateNewRegisterActionPerformed(java.awt.event.ActionEvent evt) {

		// file_other_info = new File_Other_Info();
		// building_info = new Building_Info();
		// litigant_info = new Litigant_Info();

		/* 创建立案呈批表按钮事件 */
		file_other_info.setM_Files_year(this.tf_m_Files_year.getText());/* 获取案卷年份 */
		file_other_info.setM_Files_num(this.tf_m_Files_num.getText());/* 获取案卷编号 */
		file_other_info.setM_Acceptance_Date(this.tf_m_Acceptance_Date
				.getText());/* 获取受理日期 */

		building_info.setM_Illegal_sites(this.tf_m_Illegal_sites.getText());/* 获取违法建房地点 */

		litigant_info.setM_Litigant_name(this.tf_m_Litigant_name.getText());/* 获取当事人姓名 */
		litigant_info.setM_Litigant_gender(this.tf_m_Litigant_gender.getText());/* 获取当事人性别 */
		litigant_info.setM_Litigant_age(this.tf_m_Litigant_age.getText());/* 获取当事人年龄 */
		litigant_info.setM_Litigant_ICaddr(this.tf_m_Litigant_ICaddr.getText());/* 获取当事人身份证详细地址 */
		litigant_info.setM_Litigant_ICcountry(this.tf_m_Litigant_ICcountry
				.getText());/* 获取当事人性别 */
		litigant_info.setM_Litigant_PhoneNum(this.tf_m_Litigant_PhoneNum
				.getText());/* 获取当事人电话 */

		File_Operation.Create_register(building_info, file_other_info,
				litigant_info);

		JOptionPane.showMessageDialog(null, "立案呈批表创建完成");
		// TODO add your handling code here:
	}

	private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JC_Files_Generater().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton CreateCaseReport;
	private javax.swing.JButton CreateNewRegister;
	private javax.swing.JPanel PANEL_LACPB;
	private javax.swing.JButton bt_Case_Ending;
	private javax.swing.JButton bt_CreateCase_discution;
	private javax.swing.JButton bt_CreatePunish_DecideTable;
	private javax.swing.JButton bt_Punish_DecideFiles;
	private javax.swing.JButton bt_createPlanSituation_Explain;
	private javax.swing.JButton bt_create_confiscateTable;
	private javax.swing.JButton bt_inform_Files_pre;
	private javax.swing.JCheckBox cb_IsFitPlan_no;
	private javax.swing.JCheckBox cb_IsFitPlan_yes;
	private javax.swing.JCheckBox cb_isFullTop_no;
	private javax.swing.JCheckBox cb_isFullTop_yes;
	private javax.swing.JCheckBox cb_isMoveIn_no;
	private javax.swing.JCheckBox cb_isMoveIn_yes;
	private javax.swing.ButtonGroup isFitPlan_Group;
	private javax.swing.ButtonGroup isFullTop_Group;
	private javax.swing.ButtonGroup isMoveIn_Group;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel23;
	private javax.swing.JLabel jLabel24;
	private javax.swing.JLabel jLabel25;
	private javax.swing.JLabel jLabel26;
	private javax.swing.JLabel jLabel27;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel30;
	private javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel46;
	private javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel51;
	private javax.swing.JLabel jLabel52;
	private javax.swing.JLabel jLabel53;
	private javax.swing.JLabel jLabel54;
	private javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private javax.swing.JLabel jLabel57;
	private javax.swing.JLabel jLabel58;
	private javax.swing.JLabel jLabel59;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel60;
	private javax.swing.JLabel jLabel61;
	private javax.swing.JLabel jLabel62;
	private javax.swing.JLabel jLabel63;
	private javax.swing.JLabel jLabel64;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextArea ta_m_Land_origin;
	private javax.swing.JTextArea ta_m_Land_type_info;
	private javax.swing.JTextField tf_Litigant_occupation;
	private javax.swing.JTextField tf_informSent_Date;
	private javax.swing.JTextField tf_m_Acceptance_Date;
	private javax.swing.JTextField tf_m_BeginBuild_date;
	private javax.swing.JTextField tf_m_Build_fund;
	private javax.swing.JTextField tf_m_Building_covers;
	private javax.swing.JTextField tf_m_Building_floors;
	private javax.swing.JTextField tf_m_Building_structure;
	private javax.swing.JTextField tf_m_Decide_Date;
	private javax.swing.JTextField tf_m_EndBuild_date;
	private javax.swing.JTextField tf_m_File_Date;
	private javax.swing.JTextField tf_m_Files_num;
	private javax.swing.JTextField tf_m_Files_year;
	private javax.swing.JTextField tf_m_Fine;
	private javax.swing.JTextField tf_m_Fine_bigWrite;
	private javax.swing.JTextField tf_m_Handler1_name;
	private javax.swing.JTextField tf_m_Handler2_name;
	private javax.swing.JTextField tf_m_ICcard_num;
	private javax.swing.JTextField tf_m_Illegal_sites;
	private javax.swing.JTextField tf_m_Inves_beginDate;
	private javax.swing.JTextField tf_m_Inves_endDate;
	private javax.swing.JTextField tf_m_Land_town;
	private javax.swing.JTextField tf_m_Land_town_director;
	private javax.swing.JTextField tf_m_Litigant_ICaddr;
	private javax.swing.JTextField tf_m_Litigant_ICcountry;
	private javax.swing.JTextField tf_m_Litigant_PhoneNum;
	private javax.swing.JTextField tf_m_Litigant_age;
	private javax.swing.JTextField tf_m_Litigant_gender;
	private javax.swing.JTextField tf_m_Litigant_name;
	private javax.swing.JTextField tf_m_Litigant_nation;
	private javax.swing.JTextField tf_m_LiveNow_addr;
	private javax.swing.JTextField tf_m_Meeting_date;
	private javax.swing.JTextField tf_m_base_covers;
	private javax.swing.JTextField tf_m_house_neighbor_E;
	private javax.swing.JTextField tf_m_house_neighbor_N;
	private javax.swing.JTextField tf_m_house_neighbor_S;
	private javax.swing.JTextField tf_m_house_neighbor_W;
	private javax.swing.JTextField tf_m_inform_Date;
	// End of variables declaration//GEN-END:variables

}