package java��ϰ��;

import java.util.Scanner;

public class ���� {
public static void main(String[] args){
	Scanner in=new Scanner(System.in);
	 int x=in.nextInt();
     int y=in.nextInt();
     if(x>y){int temp; temp=x;x=y;y=temp;}
     int m=x;
     int n=y;
     int a[] = {0};
     int j=0;//
     int i;
     System.out.print("��С������");
     	for(i=2;i<=m;i++){
     		if(m%i==0&&n%i==0){
     			a[j]=i;
     			j++;
     			m=m/i;n=n/i;i=i-1;
     		}
     	}
     	 System.out.print("��С������");
     	int sum=1;
     	for(j=0;a[j]!=0;j++){
     		sum=sum*a[j];
     	} System.out.print("��С������");
     	sum=sum*m*n;
     	System.out.print("��С������"+sum);
}
}

