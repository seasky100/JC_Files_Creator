package com.MyCode;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import com.MyCode.MyClass.Building_Info;
import com.MyCode.MyClass.File_Other_Info;
import com.MyCode.MyClass.Litigant_Info;

//ʵ��������ɰ�������
public class File_Operation {

	/* ���������������� */
	public static boolean Create_register(Building_Info buildingInfo,
			File_Other_Info fileInfo,
			Litigant_Info litigantInfo
			) {
		try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Files_year",fileInfo.getM_Files_year());/*�������*/

			dateMap.put("m_Files_num",fileInfo.getM_Files_num());/*������*/

			dateMap.put("m_Acceptance_Date",fileInfo.getM_Acceptance_Date());/*��������*/

			dateMap.put("m_Litigant_name",litigantInfo.getM_Litigant_name());/*����������*/

			dateMap.put("m_Litigant_gender",litigantInfo.getM_Litigant_gender());/*�������Ա�*/

			dateMap.put("m_Litigant_age",litigantInfo.getM_Litigant_age());/*����������*/

			dateMap.put("m_Litigant_ICaddr",litigantInfo.getM_Litigant_ICaddr());/*���������֤��ϸ��ַ*/

			dateMap.put("m_Litigant_ICcountry",litigantInfo.getM_Litigant_ICcountry());/*���������֤���ڴ�*/

			dateMap.put("m_Litigant_PhoneNum",litigantInfo.getM_Litigant_PhoneNum());/*�����˵绰*/
			
			dateMap.put("m_Illegal_sites",buildingInfo.getM_Illegal_sites());/*Υ��ռ�ؽ����ص�*/
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,outputFilePath ,"01����������.doc", "01����������.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* �������鱨�� */
	public static boolean Create_Case_Report(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",fileInfo.getM_Files_year());/*�������*/

			dateMap.put("m_Handler1_name", fileInfo.getM_Handler1_name());/* �а���1���� */

			dateMap.put("m_Handler2_name", fileInfo.getM_Handler2_name());/* �а���2���� */

			dateMap.put("m_Inves_beginDate", fileInfo.getM_Inves_beginDate());/* ������ʼʱ�� */

			dateMap.put("m_Inves_endDate", fileInfo.getM_Inves_endDate());/* ������ֹʱ�� */

			dateMap.put("m_File_Date", fileInfo.getM_File_Date());/* ���鱨�����ʱ�� */

			// dateMap.put("m_Acceptance_Date",
			// fileInfo.getM_Acceptance_Date());/* �������� */

			// dateMap.put("m_Unit_name",fileInfo.getM_Unit_name());��λ����

			// dateMap.put("m_Unit_represent",fileInfo.getM_Unit_represent());����������

			// dateMap.put("m_Unit_Addr",fileInfo.getM_Unit_Addr());��λ��ַ

			// dateMap.put("m_Unit_tel",fileInfo.getM_Unit_tel());��λ�绰

			dateMap.put("m_Litigant_name", litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* �������Ա� */

			dateMap.put("m_Litigant_age", litigantInfo.getM_Litigant_age());/* ���������� */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* ���������� */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* ������ְҵ */
			
			// dateMap.put("m_Litigant_ICaddr",litigantInfo.getM_Litigant_ICaddr());/*
			// ���������֤��ϸ��ַ */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_LiveNow_addr", litigantInfo.getM_LiveNow_addr());/* ��������סַ */

			dateMap.put("m_ICcard_num", litigantInfo.getM_ICcard_num());/* ���������֤���� */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* �����˵绰 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* ��ʼ����ʱ�� */

			dateMap.put("m_Illegal_sites", buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_EndBuild_date", buildingInfo.getM_EndBuild_date());/* ��ɽ���ʱ�� */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() ? "�ѷⶥ" : "δ�ⶥ");/* �Ƿ�ⶥ */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() ? "����ס" : "δ��ס");/* �Ƿ���ס */

			dateMap.put("m_base_covers", buildingInfo.getM_base_covers());/* ռ����� */

			dateMap.put("m_Land_type_info", buildingInfo.getM_Land_type_info());/* �����ı���Ϣ */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */

			dateMap.put("m_Build_fund", buildingInfo.getM_Build_fund());/* ����Ͷ���ʽ� */

			dateMap.put("m_Land_origin", buildingInfo.getM_Land_origin());/* ������Դ */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* ��������_�� */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* ��������_�� */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* ��������_�� */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* ��������_�� */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* �Ƿ����������������滮 */

			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "02���鱨��.doc",
					"02���鱨��.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/* ������������ */
	public static boolean Create_Case_discution(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*�������*/
			
			dateMap.put("m_Meeting_date",
					fileInfo.getM_Meeting_date());/*������������*/

			dateMap.put("m_Handler1_name", 
					fileInfo.getM_Handler1_name());/* �а���1���� */

			dateMap.put("m_Handler2_name", 
					fileInfo.getM_Handler2_name());/* �а���2���� */

			dateMap.put("m_Land_town", 
					fileInfo.getM_Land_town());/* Υ������������ */

			dateMap.put("m_Land_town_director", 
					fileInfo.getM_Land_town_director());/* Υ���������������� */
			
			dateMap.put("m_Litigant_name",
					litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* ��ʼ����ʱ�� */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* ��ɽ���ʱ�� */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "�ѷⶥ" : "δ�ⶥ");/* �Ƿ�ⶥ */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "����ס" : "δ��ס");/* �Ƿ���ס */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* �����ı���Ϣ */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */

			dateMap.put("m_Build_fund", 
					buildingInfo.getM_Build_fund());/* ����Ͷ���ʽ� */

			dateMap.put("m_Land_origin", 
					buildingInfo.getM_Land_origin());/* ������Դ */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* ��������_�� */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* ��������_�� */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* ��������_�� */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* ��������_�� */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* �Ƿ����������������滮 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* ������ */
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* �������д */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "03��������.doc",
					"03��������.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* ������֪���ĸ�͸�֪�� */
	public static boolean Create_inform_Files(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*�������*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*������*/

			dateMap.put("m_inform_Date",
					fileInfo.getM_inform_Date());/*��֪�����ʱ��*/
			
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* �������Ա� */

			dateMap.put("m_Litigant_age", 
					litigantInfo.getM_Litigant_age());/* ���������� */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* ���������� */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* ������ְҵ */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_LiveNow_addr", 
					litigantInfo.getM_LiveNow_addr());/* ��������סַ */

			dateMap.put("m_ICcard_num", 
					litigantInfo.getM_ICcard_num());/* ���������֤���� */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* �����˵绰 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* ��ʼ����ʱ�� */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* ��ɽ���ʱ�� */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "�ѷⶥ" : "δ�ⶥ");/* �Ƿ�ⶥ */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "����ס" : "δ��ס");/* �Ƿ���ס */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */

			String DiLeiInfo=buildingInfo.getM_Land_type_info().replace(litigantInfo.getM_Litigant_name(), "��");
			
			dateMap.put("m_Land_type_info", DiLeiInfo);/* �����ı���Ϣ */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* ��������_�� */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* ��������_�� */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* ��������_�� */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* ��������_�� */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* �Ƿ����������������滮 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* ������ */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* �������д */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "04���ĸ�.doc",
					"04���ĸ�.xml"); 
			File_Operation.file_operate(dateMap,
					outputFilePath, "05����������֪��.doc",
					"05����������֪��.xml");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* ����������������� */
	public static boolean Create_punish_DecideTable(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {
		
		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*�������*/
			
			dateMap.put("m_Acceptance_Date",
					fileInfo.getM_Acceptance_Date());/*��������*/
			
			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*������*/
			
			dateMap.put("m_Inves_beginDate", 
					fileInfo.getM_Inves_beginDate());/* ������ʼʱ�� */

			dateMap.put("m_Inves_endDate", 
					fileInfo.getM_Inves_endDate());/* ������ֹʱ�� */

			dateMap.put("m_Litigant_name",
					litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* ������ */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* �������д */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "06�����������������.doc",
					"06�����������������.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* ���������ĸ�;����� */
	public static boolean Create_punish_DecideFiles(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*�������*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*������*/

			dateMap.put("m_inform_Date",
					fileInfo.getM_inform_Date());/*��֪�����ʱ��*/
			
			dateMap.put("m_Decide_Date",
					fileInfo.getM_Decide_Date());/*���������ʱ��*/
			
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* �������Ա� */

			dateMap.put("m_Litigant_age", 
					litigantInfo.getM_Litigant_age());/* ���������� */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* ���������� */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* ������ְҵ */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_LiveNow_addr", 
					litigantInfo.getM_LiveNow_addr());/* ��������סַ */

			dateMap.put("m_ICcard_num", 
					litigantInfo.getM_ICcard_num());/* ���������֤���� */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* �����˵绰 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* ��ʼ����ʱ�� */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* ��ɽ���ʱ�� */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "�ѷⶥ" : "δ�ⶥ");/* �Ƿ�ⶥ */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "����ס" : "δ��ס");/* �Ƿ���ס */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* �����ı���Ϣ */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* ��������_�� */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* ��������_�� */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* ��������_�� */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* ��������_�� */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* �Ƿ����������������滮 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* ������ */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* �������д */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "08�����ĸ�.doc",
					"08�����ĸ�.xml"); 
			File_Operation.file_operate(dateMap,
					outputFilePath, "09��������������.doc",
					"09��������������.xml");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* �����᰸������ */
	public static boolean Create_Case_Ending(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Acceptance_Date",
					fileInfo.getM_Acceptance_Date());/*��������*/
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*�������*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*������*/

			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* ���������� */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* �����˵绰 */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* ���������֤���ڴ� */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* ��ʼ����ʱ�� */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* ��ɽ���ʱ�� */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "�ѷⶥ" : "δ�ⶥ");/* �Ƿ�ⶥ */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "����ס" : "δ��ס");/* �Ƿ���ס */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* �����ı���Ϣ */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* ������ */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* �������д */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "11�᰸������.doc",
					"11�᰸������.xml"); 
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* ����û�ղ����嵥 */
	public static boolean Create_confiscate_Table(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* ���������� */
			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* ���ݲ��� */
			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* ���ݽṹ */
			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* ������� */
			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "10û�ղ����嵥.doc",
					"10û�ղ����嵥.xml"); 
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	/* �����滮������ڵ����˵�� */
	public static boolean Create_plan_situate(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* ���������� */
			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* ռ����� */
			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* Υ��ռ�ؽ����ص� */
			
			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* �����ı���Ϣ */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "�滮���˵��.doc",
					"�滮���˵��.xml"); 
			//String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "�ڵ����˵��.doc",
					"�ڵ����˵��.xml"); 
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	/*����������Ŀ���ļ�*/
	public static boolean file_operate(Map<String, String> dateMap,/* ��Ҫ�������ݼ�ֵ�� */
			String outputPath,/* ���·�� */
			String outputfileName,/* ����ĵ����� */
			String inputFileName/* ����ģ���ĵ����� */
	) {

		WordUtil handler = new WordUtil();
		Writer out;
		try {
			/* �ж�Ŀ������Ŀ¼�Ƿ���ڣ������������������Ŀ¼ */
			File file = new File(outputPath);
			if (!file.exists()) {
				file.mkdirs();/* ����Ŀ���ĵ�����Ŀ¼ */
			} else {
				/*System.out.println("Ŀ������Ŀ¼�Ѿ����ڣ�");*/
			}

			/* ����ĵ�·�����ĵ����� */
			out = new OutputStreamWriter(new FileOutputStream(outputPath + "\\"
					+ outputfileName), "UTF-8");

			/* ����ģ�岢������д��Ŀ���ļ��� */
			handler.write("/com/MyCode/templete", inputFileName, dateMap, out);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
