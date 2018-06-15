package model;

import java.nio.charset.StandardCharsets;
import entity.*;
import java.util.ArrayList;

public class GetHeaderItems {
	
	
	public static ArrayList<HeaderItem> GetHeaderItems()
	{
		ArrayList<HeaderItem> headerItems = new ArrayList<HeaderItem>();
		StandardCharsets.UTF_8.name();
		
		HeaderItem h1 = new HeaderItem("menu", "acvmenu bt_home", "", "Trang chủ", "Trang chủ", "sprite");
		HeaderItem h2 = new HeaderItem("menu-thoi-su", "acvmenu li_left", "thoi-su", "THỜI SỰ", "THỜI SỰ", "");
		HeaderItem h3 = new HeaderItem("menu-thi-truong-chung-khoan", "acvmenu", "thi-truong-chung-khoan", "CHỨNG KHOÁN", "CHỨNG KHOÁN", "");
		HeaderItem h4 = new HeaderItem("menu-bat-dong-san", "acvmenu", "bat-dong-san", "BẤT ĐỘNG SẢN", "BẤT ĐỘNG SẢN", "");
		HeaderItem h5 = new HeaderItem("menu-doanh-nghiep", "acvmenu", "doanh-nghiep", "DOANH NGHIỆP", "DOANH NGHIỆP", "");
		HeaderItem h6 = new HeaderItem("menu-tai-chinh-ngan-hang", "acvmenu", "tai-chinh-ngan-hang", "NGÂN HÀNG", "NGÂN HÀNG", "");
		HeaderItem h7 = new HeaderItem("menu-tai-chinh-quoc-te", "acvmenu", "tai-chinh-quoc-te", "TÀI CHÍNH QUỐC TẾ", "TÀI CHÍNH QUỐC TẾ", "");
		HeaderItem h8 = new HeaderItem("menu-vi-mo-dau-tu", "acvmenu", "vi-mo-dau-tu", "VĨ MÔ", "VĨ MÔ", "");
		HeaderItem h9 = new HeaderItem("menu-song", "acvmenu", "song", "SỐNG", "SỐNG", "");
		HeaderItem h10 = new HeaderItem("menu-hang-hoa-nguyen-lieu", "acvmenu", "thi-truong", "THỊ TRƯỜNG", "THỊ TRƯỜNG", "");
		
		headerItems.add(h1);headerItems.add(h2);headerItems.add(h3);
		headerItems.add(h4);headerItems.add(h5);headerItems.add(h6);
		headerItems.add(h7);headerItems.add(h8);headerItems.add(h9);headerItems.add(h10);
		return headerItems;
	}
}
