//1
public class arr{
    public static void main(String[] args){
        int[] arr;    //先声明
        arr=new int[5];  //分配空间
        for(int i=0;i<5;i++)arr[i]=i*10;  //赋值
        for(int i=0;i<5;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
   
   //2
    public class arr{
    public static void main(String[] args){
        int[] arr=new int[5];    //声明并分配空间
        for(int i=0;i<5;i++)arr[i]=i*10;    //赋值
        for(int i=0;i<5;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}    



//3.
public class arr{
    public static void main(String[] args){
        int[] arr={20,68,34,22,34}; //声明并分配空间然后.赋值    等同于 int[] arr= new []{20,68,34,22,34};

 for(int i=0;i<5;i++){
   System.out.println("arr["+i+"]="+arr[i]);
     }
    }
   } 

