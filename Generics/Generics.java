package Generics;

class Generics {
  public static void main(String[] args) {

    
    GenericsClass<Integer> intObj = new GenericsClass<>(5);
    System.out.println("Generic Class returns: " + intObj.getData());

   
    GenericsClass<String> stringObj = new GenericsClass<>("Java Programming");
    System.out.println("Generic Class returns: " + stringObj.getData());
  }
}


class GenericsClass<T> {

  
  private T data;

  public GenericsClass(T data) {
    this.data = data;
  }
  //zxc


  public T getData() {
    return this.data;
  }
}
