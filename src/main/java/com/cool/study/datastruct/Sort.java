package com.cool.study.datastruct;

/**
 * Created by cool on 16/7/5.
 */
public class Sort {

    int a[]={49,38,65,97,76,13,27,49,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};

    public void insertSort(int num[]){


        int tmp=0;
        for (int i=1;i<num.length;i++){
            tmp=num[i];
            int j=i-1;
            for(;j>=0&&num[j]>tmp;j--){
                num[j+1]=num[j];
            }
            num[j+1]=tmp;
        }
        printArray(num);
    }


    public void shellSort(int a[]){
        double d1=a.length;
        int temp=0;
        while(true){
            d1= Math.ceil(d1/2);
            int d=(int) d1;
            for(int x=0;x<d;x++){
                for(int i=x+d;i<a.length;i+=d){
                    int j=i-d;
                    temp=a[i];
                    for(;j>=0&&temp<a[j];j-=d){
                        a[j+d]=a[j];
                    }
                    a[j+d]=temp;
                }
            }
            if(d==1)
                break;
        }


        
        printArray(a);
    }

    public void selectSort(int a[]){

        int  length=a.length,postion=0,tmp=0;
        for (int i=0;i<length;i++){

            tmp=a[i];
            for (int j=i+1;j<length;j++){

                if (a[j]<tmp){
                    tmp=a[j];
                    postion=j;
                }
            }
            a[postion]=a[i];
            a[i]=tmp;

        }
        printArray(a);

    }


    public void quickSort(int a[]){

        quickSort(a,0,a.length-1);
        printArray(a);

    }

    public void quickSort(int list[] ,int low,int hight){

        if (low<hight){
            //quickSort(list,);
            int middle=getMiddle(list,low,hight);
            quickSort(list,low,middle-1);
            quickSort(list,middle+1,hight);

        }

    }

    public int getMiddle(int list[],int low,int hight){

        int tmp=list[low];

        //一个从左边，另一个从右边
        while(low<hight){

            while (low <hight &&list[hight]>tmp) hight--;
            list[low]=list[hight];
            while (low<hight && list[low]<=tmp) low++;
            list[hight]=list[low];

        }

        list[low]=tmp;
        return low;
    }

    public void bubbleSort(int a[]){

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){

                if (a[j]<a[i]){
                    a[j]=a[i]+a[j];
                    a[i]=a[j]-a[i];
                    a[j]=a[j]-a[i];
                }
            }
        }
        printArray(a);

    }
    public void printArray(int num1[]){
        for (int i=0 ; i<num1.length ;i++){
            System.out.print(num1[i] + " , ");
        }
    }

    public static void main(String[] args) {
        Sort sort=new Sort();
        sort.quickSort(sort.a);
        System.out.println("\n" + (int) Math.ceil(sort.a.length / 2));

    }

}
