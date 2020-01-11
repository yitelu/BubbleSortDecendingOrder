class Main {
  public static void main(String[] args) {

    int[] myArr = {-1, 3, 40, 2, 8, 89, 41, 99, 107, 40};

    System.out.print("unsorted array");
    for(int a: myArr){
      System.out.print(" " +a);
    }

    for(int Loop=0; Loop<myArr.length-1; Loop++){
      for(int i= 0; i<myArr.length-1; i++){

        int j = i;
        j++;
        if(myArr[i] < myArr[j]){
          goDecendingOrder(myArr, i, j);
        }
    }
  }

    System.out.println(" ");
    System.out.print("sorted array");
    for(int a: myArr){
      System.out.print(" " +a);
    }
    
  }

  public static void goDecendingOrder(int[] myArr, int i, int j){

    int temp = myArr[j];
    myArr[j] = myArr[i];
    myArr[i] = temp; 
  }






}