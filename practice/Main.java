
class Main{

    public static void main(String args[]){
         String str = "racy";
    String str1="car";
    
    int arr[]= new int[26];
    
    for(int i=0; i<str.length();i++){
        arr[str.charAt(i)-'a']++;
        arr[str1.charAt(i)-'a']--;
    }
    
    for(int e: arr){
        if(e!=0){
            System.out.println("false");
            break;
        }
    }
    System.out.println("true");
    }
    
   
}