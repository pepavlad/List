package com.company;

public class List <T>{
    private Object[] elements;
    public Object[] getElements(){
        return elements;
    }
    public void remove(int index) {
        Object[] newArr = new Object[elements.length];
        for (int i = 0; i < elements.length; i++){
            newArr[i] = elements[i];
        }
        newArr[index] = null;
        for (int i = index + 1; i < elements.length; i++) {
            newArr[i-1] = elements[i];
            newArr[i] = null;
        }
        Object[] newArr2 = new Object[elements.length-1];
        for (int i =0; i < elements.length - 1; i++){
            newArr2[i] = newArr[i];
        }
        newArr = newArr2;
        elements = newArr;
    }
   public void swapElemByBubbleMethod(Object[] arrOfUsers, int firstIndex, int secondIndex){
       Object tmp = arrOfUsers[firstIndex];
       arrOfUsers[firstIndex] = arrOfUsers[secondIndex];
       arrOfUsers[secondIndex] = tmp;
   }
   public void sortByQuickSort(Object[] elements, int low, int high){
       if (low >= high){
           return;
       }
       int middleIndex = low + (high - low) / 2;
       int supElement = (Integer) elements[middleIndex];
       int i = low, j = high;
       while (i <= j) {
           while ((Integer)elements[i] > supElement) {
               i++;
           }
           while ((Integer)elements[j] < supElement) {
               j--;
           }
           if (i <= j) {
               swapElemByBubbleMethod(elements, i, j);
               i++;
               j--;
           }
       }
       if (low < j)
           sortByQuickSort(elements, low, j);

       if (high > i)
           sortByQuickSort(elements, i, high);
   }
    public void add(T element){
        if(elements == null){
            elements = new Object[1];
            elements[0] = element;
        } else if (elements.length > 0){
            Object[] newArr = new Object[elements.length + 1];
            for (int i = 0; i < elements.length;i++){
                newArr[i] = elements[i];
            }
            newArr[elements.length] = element;
            elements = newArr;
        }
    }
    public void addAll (T...element){
        int index = 0;
        if(elements == null){
            elements = new Object[element.length];
            for (int i =0;i < element.length; i++) {
                elements[i] = element[i];
            }
        }
        if(elements.length > 0){
            Object[] newArr = new Object[elements.length + element.length];
            for (int i =0; i < elements.length; i++){
                newArr[i] = elements[i];
                index++;
            }
            for(int j = 0 ; j < element.length; j++){
                newArr[index++] = element[j];
            }
            elements = newArr;
        }
    }
    public void show(){
        for (int i = 0; i < elements.length; i++){
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
    public Object get(int index){
        if (elements == null || elements[index] == null){
            throw new NullPointerException();
        }
        return elements[index];
    }
}
