
public class ktrasochanle {
    public static void main(String[] args) { 
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        String[] arrEvent = new String[num.length]; 
        String[] arrOdd = new String[num.length]; 
        /* 
         * arrEvent và arrOdd sử dụng String vì khi chưa có dữ liệu thì phần tử của nó sẽ null 
         * dựa vào null để kiểm tra xem mảng được set bao nhiêu phần tử. 
         * còn nếu khai báo int[] arrEvent thì các phần tử của arrEvent đều có giá trị ban đầu = 0 
         */ 
         
        int loop = 0; // để đếm xem mất bao nhiêu vòng xử lý. 

        //Lọc lấy số chẵn 
        int index = 0; 
        for (int i = 0; i < num.length; i++) { 
            loop++; 
            if (num[i] % 2 == 0){ 
                arrEvent[index] = "" + num[i]; 
                index++; 
            } 
        } 

        //Lọc lấy số lẻ 
        index = 0; 
        for (int i = 0; i < num.length; i++) { 
            loop++; 
            if (num[i] % 2 != 0){ 
                arrOdd[index] = "" + num[i]; 
                index++; 
            } 
        } 

        //Đưa số chẵn trở lại mảng ban đầu 
        for (int i = 0; i < arrEvent.length; i++){ 
            loop++; 
            if (arrEvent[i] == null){ 
                break; 
            } 
            num[i] = Integer.parseInt(arrEvent[i]); 
        } 

        //Đưa số chẵn trở lại mảng ban đầu 
        for (int i = 0; i < arrOdd.length; i++){ 
            loop++; 
            if (arrOdd[i] == null){ 
                break; 
            } 
            num[num.length- i - 1] = Integer.parseInt(arrOdd[i]); 
        } 

        System.out.println("loop count: " + loop); 
        for (int i = 0; i < num.length; i++) { 
            System.out.println(num[i]); 
        } 
    } 
}
