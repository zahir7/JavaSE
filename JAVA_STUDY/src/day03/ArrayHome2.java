package day03;

import java.util.Scanner;

public class ArrayHome2 {

	public static void main(String[] args) {

		String [] name = {
				"장동건","장남건","장서건","장중건","북두신건"};
		
		int [] ban = {2,1,2,1,2}; 
		int [] kor = {20,85,95,70,65};
        int [] eng = {15,80,100,55,90};
        int [] mat = {65,85,80,75,80};
        
        int [] sum = new int [name.length];
        int [] avg = new int [name.length];        
       
        int [] totalRank = new int [name.length];    
        int [] banRank = new int [name.length];
        int [] totalSort = new int [name.length];
        int [] banSort = new int [name.length];
        
        
        String [] grade = new String [name.length];
        String [] gradeIndex = {
        		"가","가","가","가","가","가",
				"양","미","우","수","수"
        };
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("출력방법: 1. 전체등수, 2.반별등수");
        System.out.print("입력:");
        
        int kind = sc.nextInt();
        
        
        ///2. 연산부
        //2.1 초기 정보 계산
        for (int i = 0; i < name.length; i++) {		// 성적 저장 sum, avg, grade
       
			sum[i]= kor[i]+eng[i]+mat[i];	// 총점
			avg[i] = sum[i]/3; 				// 평균
			grade[i] = gradeIndex[avg[i]/10];	// 수우미양가

		}
        
        ///2.2 등수 계산
		for (int i = 0; i < name.length; i++) {
        	totalRank[i]=1;		
        	System.out.println("totalRank["+i+"] :  " + totalRank[i]);
        	banRank[i]=1;		
        	System.out.println("banRank["+i+"] :  " + banRank[i]);
        	
        	
        	System.out.println("if(ban["+i+"]) :  " + ban[i]);
        	if(ban[i]==2){
        		// 몇반 
        		banSort[i]=2;
        		System.out.println("banSort["+i+"] :  " + banSort[i]);
        	}
        		
        	
        	for (int j = 0; j < name.length; j++) {
        		
        		System.out.println("if(avg["+i+"] <avg["+j+"] ) :  " + (avg[i]<avg[j]));
				if(avg[i]<avg[j] ) {
					
					totalRank[i]++;
					System.out.println("totalRank["+i+"] :  " + totalRank[i]);
					totalSort[i]++;
					System.out.println("totalSort["+i+"] :  " + totalSort[i]);
					
					
					System.out.println("if(ban["+i+"] <ban["+j+"] ) :  " + (ban[i]<ban[j]));
					if(ban[i]==ban[j]){
						banRank[i]++;
						System.out.println("banRank["+i+"] :  " + banRank[i]);
						banSort[i]++;
						System.out.println("banSort["+i+"] :  " + banSort[i]);
					}
				}
			}
        }
    	   
		int [] printSort= totalSort;
        int [] printRank = totalRank;
        
        System.out.println("kind :  " + kind);
    	switch(kind)
    	{
    		case 2:
    			printRank = banRank;
    			System.out.println("printRank :  " + printRank);
    			printSort = banSort;
    			System.out.println("printSort :  " + printSort);
    			break;
    	}
	        
	        ///3. 출력부
			
        for (int r = 0; r <name.length; r++) {
			
	        for (int i = 0; i < name.length; i++) {
	        	String str = 
	        			ban[i]+"\t"+
	        			name[i]+"\t"+
	        			kor[i]+"\t"+
	        			eng[i]+"\t"+
	        			mat[i]+"\t"+
	        			sum[i]+"\t"+
	        			avg[i]+"\t"+
	        			grade[i]+"\t"+
	        			printRank[i]+"\t"+
	        			totalRank[i]+"\t"+
	        			banRank[i]+"\t"+"\t"+
	        			printSort[i]+"\t"+
	        			totalSort[i]+"\t"+
	        			banSort[i]
	        			;
	        	
	        	if(r == printSort[i])
	        	System.out.println(str);
	        }
        }
    }
}
