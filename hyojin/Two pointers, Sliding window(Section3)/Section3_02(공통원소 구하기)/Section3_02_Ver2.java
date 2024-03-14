package Section3_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Section3_02_Ver2 {
    public ArrayList<Integer> solution(int n1, int n2, int arr1[], int arr2[]){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0, p2=0;
        while(p1<n1 && p2<n2){
            if(arr1[p1]==arr2[p2]){
                answer.add(arr1[p1++]);
                p2++;
            }
            else if(arr1[p1]>arr2[p2]) p2++;
            else p1++;
        }
        return answer;
    }
    public static void main(String[] args){
        Section3_02_Ver2 t = new Section3_02_Ver2();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr1[]=new int[n];
        for(int i=0; i<n; i++){
            arr1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int[] arr2=new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i]=scanner.nextInt();
        }
        for(int x: t.solution(n, n2,arr1,arr2)) System.out.print(x+" ");
    }
}
