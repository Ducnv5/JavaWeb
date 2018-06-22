package model;

import entity.*;
import java.util.ArrayList;
import java.util.Date;

public class GetArticle {
	
	
	public ArrayList<Article> getArticle()
	{
		ArrayList<Article> articles = new ArrayList<Article>();
		
		Article a1 = new Article();
		Article a2 = new Article();
		
		articles.add(a1);
		articles.add(a2);
		
		return articles;
	}
	
	public static Article getSingleArticle()
	{
		Article art = new Article();
		
		art.setHref_1("http://cafefcdn.com/zoom/260_162/2018/6/20/photo1529484163075-15294841630751417808637.jpg");
		art.setHref_2("http://cafefcdn.com/2018/6/20/photo-1-1529483942682886471747.jpg");
		art.setId("bai-bao-1");
		art.setGroup("kinh-te");
		art.setPreview("Tây Ninh vốn nổi tiếng với diện tích cao su 100 ngàn ha, mía 25 ngàn ha, 50 ngàn ha mì... "
				+ "nhưng gần đây do giá trị nông sản này thấp nên đang có bước dịch chuyển mới sang "
				+ "trồng rau quả, trong đó cây ăn quả là chủ lực.\r\n" + 
				"");
		art.setBody("Cũng theo ông Hưng, trồng 1ha cam, quýt khoảng 3 năm rưỡi, tức 42 tháng, chi phí đầu tư 400-500 triệu;"
				+ " còn nhãn, sầu riêng thấp hơn,&nbsp;khoảng 150 triệu. Dự kiến năm 2019 thu hoạch, năng suất cam quýt "
				+ "40-50 tấn/ha; nhãn gần 20 tấn. Nếu tính theo thời giá hiện tại 15 ngàn đồng/kg, thì 1 ha cam, "
				+ "quýt doanh thu 600 triệu, trừ chi phí phân nửa vẫn còn lãi 300 triệu. Trong khi đó, trồng cao su "
				+ "sau&nbsp;6 năm mới thu hoạch, năm đầu cạo mủ không bao nhiêu, năm thứ hai nếu giá mủ như hiện nay "
				+ "thì sau khi trừ chi phí, thu nhập còn lại khoảng 50 triệu/ha. Như vậy, về giá trị kinh tế của cây ăn "
				+ "quả cao gấp mấy lần. Đó là chưa tính sản phẩm sầu riêng.</p><h3> 	"
				+ "<strong>Băn khoăn đầu ra</strong></h3><p>Chúng tôi tiếp tục tìm về huyện Dương Minh Châu, "
				+ "tại đây đang phát triển các vùng CĂQ rất mạnh, nhất là các xã Truông Mít, Phước Ninh, Phước Minh... "
				+ "Trước đây, các xã này chủ yếu trồng lúa, mì, mía. Theo đề án quy hoạch, xã Truông Mít sẽ chuyển đổi"
				+ " 1.550ha, xã Phước Ninh 380ha, Phước Minh 350ha từ diện tích trồng lúa, mì...</p><p>Đáng nói, có 3 "
				+ "ấp Thuận Bình, Thuận An, Thuận Tân thuộc xã Truông Mít, nông dân đang ồ ạt chuyển đổi từ việc trồng "
				+ "lúa, đậu phộng sang trồng nhãn tiêu da bò với diện tích khoảng 1.200ha. Ngoài ra, còn có một số loại "
				+ "cây ăn quả khác cũng đang được người dân tại đây trồng khá nhiều là sầu riêng, nhãn xuồng.</p><p>"
				+ "Ông Lê Nhật Toàn, ấp Thuận Bình, xã Truông Mít cho biết, gia đình ông trồng 3ha lúa thu nhập khoảng "
				+ "10 triệu/ha/vụ, nên ông đã phá bỏ chuyển sang trồng nhãn tiêu da bò. “Cây nhãn cho thu&nbsp;cao hơn nhiều, bình quân khoảng 200-250 triệu đồng/ha, cao gấp nhiều lần so với cây lúa. Tuy nhiên, tụi tui phần lớn là tự phát vì trồng cây này có giá trị cao nên có những vùng thấp chưa có kênh tiêu, có trường hợp sau khi phá lúa trồng nhãn dẫn tới cây nhãn ngập úng năng suất thấp”, ông Toàn chia sẻ.</p><p>Ngoài nhãn tiêu da bò đang được trồng nhiều tại xã Truông Mít, một số loại CĂQ khác như sầu riêng Ri6, nhãn Indo, nhãn xuồng, bưởi da xanh, thơm, mãng cầu xiêm, xoài cát chu cũng đang được trồng đại trà tại huyện Dương Minh Châu. Lý do gần đây, những loại trái cây này đều có thị trường tiêu thụ, có loại được xuất khẩu sang Hàn Quốc, Nhật Bản.</p><p>Đáng nói, ở hai xã Phước Ninh và Phước Minh, do dịch bệnh khảm lá trên cây mì bị thiệt hại nặng về kinh tế nên nông dân đã chuyển đổi một số diện tích trồng mì sang trồng bưởi da xanh và măng điền trúc. Tuy nhiên, việc chuyển đổi đa phần cũng là tự phát, trong khi chưa có vùng quy hoạch CĂQ cụ thể. Ông Thi Khắc Huy (PCT xã Phước Ninh) cho biết, định hướng tái cơ cấu cây trồng của ngành nông nghiệp là phù hợp với nhu cầu của người dân và điều kiện thổ nhưỡng của địa phương. Tuy nhiên, người dân đang rất quan tâm tới đầu ra của sản phẩm. “Để nông dân an tâm tham gia vùng chuyên canh, chuyển đổi trồng cây ăn quả thì cần phải có sự liên kết trong sản xuất, chế biến và tiêu thụ sản phẩm. Đây là tâm lý chung của người dân địa phương khi chuyển từ các loại cây trồng truyền thống sang CĂQ”, ông Thi bày tỏ.</p><p>Theo ông Võ Đức Trong - GĐ Sở NN-PTNT Tây Ninh, ngành NN đang hướng tới cơ cấu lại một số sản phẩm, trong đó chủ trương giảm diện tích cao su, giảm diện tích đất lúa nhưng không chuyển mục đích sử dụng... để chuyển sang trồng rau và CĂQ. Các chính sách cơ bản đã có, giúp nông dân lập dự án để hưởng chính sách. Trong 6 tháng đầu năm, tỉnh đã giải ngân gần 4 tỷ đồng (trong tổng số 30 tỷ) để phục vụ cho các dự án chuyển đổi. Hiện tỉnh đang rà soát lại quỹ đất nông nghiệp trồng cao su và có chủ trương thanh lý để chuyển trồng CĂQ, như Cty CP TM Cao su Thiên Bích 500ha; Cty CP Cao su 1-5 gần 2.000ha cao su..");
		art.setHeader("Tây Ninh chuyển đổi cao su, lúa, mì... sang cây ăn quả");
		art.setInput_time(new Date());
		return art;
	}
	
	
}
