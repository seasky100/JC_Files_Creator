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

//实体操作生成案卷方法类
public class File_Operation {

	/* 创建立案呈批表方法 */
	public static boolean Create_register(Building_Info buildingInfo,
			File_Other_Info fileInfo,
			Litigant_Info litigantInfo
			) {
		try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Files_year",fileInfo.getM_Files_year());/*案卷年份*/

			dateMap.put("m_Files_num",fileInfo.getM_Files_num());/*案卷编号*/

			dateMap.put("m_Acceptance_Date",fileInfo.getM_Acceptance_Date());/*受理日期*/

			dateMap.put("m_Litigant_name",litigantInfo.getM_Litigant_name());/*当事人姓名*/

			dateMap.put("m_Litigant_gender",litigantInfo.getM_Litigant_gender());/*当事人性别*/

			dateMap.put("m_Litigant_age",litigantInfo.getM_Litigant_age());/*当事人年龄*/

			dateMap.put("m_Litigant_ICaddr",litigantInfo.getM_Litigant_ICaddr());/*当事人身份证详细地址*/

			dateMap.put("m_Litigant_ICcountry",litigantInfo.getM_Litigant_ICcountry());/*当事人身份证所在村*/

			dateMap.put("m_Litigant_PhoneNum",litigantInfo.getM_Litigant_PhoneNum());/*当事人电话*/
			
			dateMap.put("m_Illegal_sites",buildingInfo.getM_Illegal_sites());/*违法占地建房地点*/
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,outputFilePath ,"01立案呈批表.doc", "01立案呈批表.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建调查报告 */
	public static boolean Create_Case_Report(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",fileInfo.getM_Files_year());/*案卷年份*/

			dateMap.put("m_Handler1_name", fileInfo.getM_Handler1_name());/* 承办人1姓名 */

			dateMap.put("m_Handler2_name", fileInfo.getM_Handler2_name());/* 承办人2姓名 */

			dateMap.put("m_Inves_beginDate", fileInfo.getM_Inves_beginDate());/* 调查起始时间 */

			dateMap.put("m_Inves_endDate", fileInfo.getM_Inves_endDate());/* 调查终止时间 */

			dateMap.put("m_File_Date", fileInfo.getM_File_Date());/* 调查报告落款时间 */

			// dateMap.put("m_Acceptance_Date",
			// fileInfo.getM_Acceptance_Date());/* 受理日期 */

			// dateMap.put("m_Unit_name",fileInfo.getM_Unit_name());单位名称

			// dateMap.put("m_Unit_represent",fileInfo.getM_Unit_represent());法定代表人

			// dateMap.put("m_Unit_Addr",fileInfo.getM_Unit_Addr());单位地址

			// dateMap.put("m_Unit_tel",fileInfo.getM_Unit_tel());单位电话

			dateMap.put("m_Litigant_name", litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* 当事人性别 */

			dateMap.put("m_Litigant_age", litigantInfo.getM_Litigant_age());/* 当事人年龄 */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* 当事人民族 */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* 当事人职业 */
			
			// dateMap.put("m_Litigant_ICaddr",litigantInfo.getM_Litigant_ICaddr());/*
			// 当事人身份证详细地址 */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_LiveNow_addr", litigantInfo.getM_LiveNow_addr());/* 当事人现住址 */

			dateMap.put("m_ICcard_num", litigantInfo.getM_ICcard_num());/* 当事人身份证号码 */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* 当事人电话 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* 开始建房时间 */

			dateMap.put("m_Illegal_sites", buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_EndBuild_date", buildingInfo.getM_EndBuild_date());/* 完成建房时间 */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() ? "已封顶" : "未封顶");/* 是否封顶 */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() ? "已入住" : "未入住");/* 是否入住 */

			dateMap.put("m_base_covers", buildingInfo.getM_base_covers());/* 占地面积 */

			dateMap.put("m_Land_type_info", buildingInfo.getM_Land_type_info());/* 地类文本信息 */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */

			dateMap.put("m_Build_fund", buildingInfo.getM_Build_fund());/* 建设投入资金 */

			dateMap.put("m_Land_origin", buildingInfo.getM_Land_origin());/* 土地来源 */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* 房屋四至_北 */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* 房屋四至_南 */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* 房屋四至_东 */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* 房屋四至_西 */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* 是否符合土地利用总体规划 */

			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "02调查报告.doc",
					"02调查报告.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	/* 创建案件讨论 */
	public static boolean Create_Case_discution(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*案卷年份*/
			
			dateMap.put("m_Meeting_date",
					fileInfo.getM_Meeting_date());/*案件讨论日期*/

			dateMap.put("m_Handler1_name", 
					fileInfo.getM_Handler1_name());/* 承办人1姓名 */

			dateMap.put("m_Handler2_name", 
					fileInfo.getM_Handler2_name());/* 承办人2姓名 */

			dateMap.put("m_Land_town", 
					fileInfo.getM_Land_town());/* 违法地所在乡镇 */

			dateMap.put("m_Land_town_director", 
					fileInfo.getM_Land_town_director());/* 违法地所在乡镇所长 */
			
			dateMap.put("m_Litigant_name",
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* 开始建房时间 */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* 完成建房时间 */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "已封顶" : "未封顶");/* 是否封顶 */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "已入住" : "未入住");/* 是否入住 */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* 地类文本信息 */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */

			dateMap.put("m_Build_fund", 
					buildingInfo.getM_Build_fund());/* 建设投入资金 */

			dateMap.put("m_Land_origin", 
					buildingInfo.getM_Land_origin());/* 土地来源 */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* 房屋四至_北 */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* 房屋四至_南 */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* 房屋四至_东 */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* 房屋四至_西 */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* 是否符合土地利用总体规划 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* 罚款金额 */
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* 罚款金额大写 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "03案件讨论.doc",
					"03案件讨论.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建告知书文稿和告知书 */
	public static boolean Create_inform_Files(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*案卷年份*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*案卷编号*/

			dateMap.put("m_inform_Date",
					fileInfo.getM_inform_Date());/*告知书落款时间*/
			
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* 当事人性别 */

			dateMap.put("m_Litigant_age", 
					litigantInfo.getM_Litigant_age());/* 当事人年龄 */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* 当事人民族 */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* 当事人职业 */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_LiveNow_addr", 
					litigantInfo.getM_LiveNow_addr());/* 当事人现住址 */

			dateMap.put("m_ICcard_num", 
					litigantInfo.getM_ICcard_num());/* 当事人身份证号码 */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* 当事人电话 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* 开始建房时间 */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* 完成建房时间 */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "已封顶" : "未封顶");/* 是否封顶 */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "已入住" : "未入住");/* 是否入住 */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */

			String DiLeiInfo=buildingInfo.getM_Land_type_info().replace(litigantInfo.getM_Litigant_name(), "你");
			
			dateMap.put("m_Land_type_info", DiLeiInfo);/* 地类文本信息 */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* 房屋四至_北 */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* 房屋四至_南 */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* 房屋四至_东 */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* 房屋四至_西 */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* 是否符合土地利用总体规划 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* 罚款金额 */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* 罚款金额大写 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "04发文稿.doc",
					"04发文稿.xml"); 
			File_Operation.file_operate(dateMap,
					outputFilePath, "05行政处罚告知书.doc",
					"05行政处罚告知书.xml");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建处理决定呈批表 */
	public static boolean Create_punish_DecideTable(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {
		
		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*案卷年份*/
			
			dateMap.put("m_Acceptance_Date",
					fileInfo.getM_Acceptance_Date());/*受理日期*/
			
			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*案卷编号*/
			
			dateMap.put("m_Inves_beginDate", 
					fileInfo.getM_Inves_beginDate());/* 调查起始时间 */

			dateMap.put("m_Inves_endDate", 
					fileInfo.getM_Inves_endDate());/* 调查终止时间 */

			dateMap.put("m_Litigant_name",
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* 罚款金额 */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* 罚款金额大写 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			if (File_Operation.file_operate(dateMap,
					outputFilePath, "06案件处理决定呈批表.doc",
					"06案件处理决定呈批表.xml")) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建决定文稿和决定书 */
	public static boolean Create_punish_DecideFiles(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*案卷年份*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*案卷编号*/

			dateMap.put("m_inform_Date",
					fileInfo.getM_inform_Date());/*告知书落款时间*/
			
			dateMap.put("m_Decide_Date",
					fileInfo.getM_Decide_Date());/*决定书落款时间*/
			
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_gender",
					litigantInfo.getM_Litigant_gender());/* 当事人性别 */

			dateMap.put("m_Litigant_age", 
					litigantInfo.getM_Litigant_age());/* 当事人年龄 */

			dateMap.put("m_Litigant_nation",
					litigantInfo.getM_Litigant_nation());/* 当事人民族 */

			dateMap.put("m_Litigant_occupation",
					litigantInfo.getM_Litigant_occupation());/* 当事人职业 */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_LiveNow_addr", 
					litigantInfo.getM_LiveNow_addr());/* 当事人现住址 */

			dateMap.put("m_ICcard_num", 
					litigantInfo.getM_ICcard_num());/* 当事人身份证号码 */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* 当事人电话 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* 开始建房时间 */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* 完成建房时间 */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "已封顶" : "未封顶");/* 是否封顶 */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "已入住" : "未入住");/* 是否入住 */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* 地类文本信息 */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */

			dateMap.put("m_house_neighbor_N",
					buildingInfo.getM_house_neighbor_N());/* 房屋四至_北 */

			dateMap.put("m_house_neighbor_S",
					buildingInfo.getM_house_neighbor_S());/* 房屋四至_南 */

			dateMap.put("m_house_neighbor_E",
					buildingInfo.getM_house_neighbor_E());/* 房屋四至_东 */

			dateMap.put("m_house_neighbor_W",
					buildingInfo.getM_house_neighbor_W());/* 房屋四至_西 */
			
			dateMap.put("m_isFitPlan",
					buildingInfo.getM_isFitPlan());/* 是否符合土地利用总体规划 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* 罚款金额 */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* 罚款金额大写 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "08决定文稿.doc",
					"08决定文稿.xml"); 
			File_Operation.file_operate(dateMap,
					outputFilePath, "09行政处罚决定书.doc",
					"09行政处罚决定书.xml");
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建结案呈批表 */
	public static boolean Create_Case_Ending(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {

			Map<String, String> dateMap = new HashMap<String, String>();
			
			dateMap.put("m_Acceptance_Date",
					fileInfo.getM_Acceptance_Date());/*受理日期*/
			
			dateMap.put("m_Files_year",
					fileInfo.getM_Files_year());/*案卷年份*/

			dateMap.put("m_Files_num",
					fileInfo.getM_Files_num());/*案卷编号*/

			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */

			dateMap.put("m_Litigant_PhoneNum",
					litigantInfo.getM_Litigant_PhoneNum());/* 当事人电话 */
			
			dateMap.put("m_Litigant_ICcountry",
					litigantInfo.getM_Litigant_ICcountry());/* 当事人身份证所在村 */

			dateMap.put("m_BeginBuild_date",
					buildingInfo.getM_BeginBuild_date());/* 开始建房时间 */

			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */

			dateMap.put("m_EndBuild_date", 
					buildingInfo.getM_EndBuild_date());/* 完成建房时间 */

			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */

			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */

			dateMap.put("m_Building_isFullTop", buildingInfo
					.getM_Building_isFullTop() == true ? "已封顶" : "未封顶");/* 是否封顶 */

			dateMap.put("m_Building_isMoveIn", buildingInfo
					.getM_Building_isMoveIn() == true ? "已入住" : "未入住");/* 是否入住 */

			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */

			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* 地类文本信息 */

			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */

			dateMap.put("m_Fine",
					""+File_Other_Info.m_Fine);/* 罚款金额 */
			
			dateMap.put("m_Fine_bigWrite",
					File_Other_Info.m_Fine_bigWrite);/* 罚款金额大写 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "11结案呈批表.doc",
					"11结案呈批表.xml"); 
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	/* 创建没收财物清单 */
	public static boolean Create_confiscate_Table(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

		try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */
			dateMap.put("m_Building_floors",
					buildingInfo.getM_Building_floors());/* 房屋层数 */
			dateMap.put("m_Building_structure",
					buildingInfo.getM_Building_structure());/* 房屋结构 */
			dateMap.put("m_Building_covers",
					buildingInfo.getM_Building_covers());/* 建筑面积 */
			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "10没收财物清单.doc",
					"10没收财物清单.xml"); 
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	/* 创建规划情况、宗地情况说明 */
	public static boolean Create_plan_situate(Building_Info buildingInfo,
			File_Other_Info fileInfo, Litigant_Info litigantInfo) {

try {
			
			Map<String, String> dateMap = new HashMap<String, String>();
			dateMap.put("m_Litigant_name", 
					litigantInfo.getM_Litigant_name());/* 当事人姓名 */
			dateMap.put("m_base_covers", 
					buildingInfo.getM_base_covers());/* 占地面积 */
			dateMap.put("m_Illegal_sites", 
					buildingInfo.getM_Illegal_sites());/* 违法占地建房地点 */
			
			dateMap.put("m_Land_type_info", 
					buildingInfo.getM_Land_type_info());/* 地类文本信息 */
			
			String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "规划情况说明.doc",
					"规划情况说明.xml"); 
			//String outputFilePath=File_Other_Info.outputFilePath+"\\"+fileInfo.getM_Files_num()+litigantInfo.getM_Litigant_name();
			File_Operation.file_operate(dateMap,
					outputFilePath, "宗地情况说明.doc",
					"宗地情况说明.xml"); 
			
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	/*创建并生成目标文件*/
	public static boolean file_operate(Map<String, String> dateMap,/* 需要填充的数据键值对 */
			String outputPath,/* 输出路径 */
			String outputfileName,/* 输出文档名称 */
			String inputFileName/* 输入模板文档名称 */
	) {

		WordUtil handler = new WordUtil();
		Writer out;
		try {
			/* 判断目标生成目录是否存在，如果不存在则生成新目录 */
			File file = new File(outputPath);
			if (!file.exists()) {
				file.mkdirs();/* 创建目标文档生成目录 */
			} else {
				/*System.out.println("目标生成目录已经存在！");*/
			}

			/* 输出文档路径及文档名称 */
			out = new OutputStreamWriter(new FileOutputStream(outputPath + "\\"
					+ outputfileName), "UTF-8");

			/* 加载模板并将内容写至目标文件中 */
			handler.write("/com/MyCode/templete", inputFileName, dateMap, out);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return true;
	}

}
