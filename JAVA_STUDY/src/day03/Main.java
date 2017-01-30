package day03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		String[] name = { "장동건", "장남건", "장서건", "장중건", "북두신건" };
//
//		int[] ban = { 2, 1, 2, 1, 2 };
//		int[] kor = { 20, 85, 95, 70, 65 };
//		int[] eng = { 15, 80, 100, 55, 90 };
//		int[] mat = { 65, 85, 80, 75, 80 };
//
//		String[] gradeIndex = { "가", "가", "가", "가", "가", "가", "양", "미", "우", "수", "수" };
//
//		Map nameMap = new HashMap<Integer, String>();
//		Map banMap = new HashMap<Integer, Integer>();
//		Map korMap = new HashMap<Integer, Integer>();
//		Map engMap = new HashMap<Integer, Integer>();
//		Map matMap = new HashMap<Integer, Integer>();
//		Map sumMap = new HashMap<Integer, Integer>();
//		Map avgMap = new HashMap<Integer, Integer>();
//
//		Map keyMap = new HashMap<Integer, Integer>();
//
//		Map gradeIndexMap = new HashMap<Integer, String>();
//
//		for (int i = 0; i < name.length; i++) {
//
//			nameMap.put(i, name[i]);
//			banMap.put(i, ban[i]);
//			korMap.put(i, kor[i]);
//			engMap.put(i, eng[i]);
//			matMap.put(i, mat[i]);
//
//			sumMap.put(i, kor[i] + eng[i] + mat[i]);
//			int tempSum = (int) sumMap.get(i);
//			avgMap.put(i, tempSum / 3);
//
//			int tempAvg = (int) avgMap.get(i);
//			gradeIndexMap.put(i, gradeIndex[tempAvg / 10]);
//
//		}
//
//		
//		Set<Integer> sortSet = new TreeSet<Integer>();
//		List<Integer> avgList = new ArrayList<Integer>();
//
//		for (int i = 0; i < avgMap.size(); i++) {
//			keyMap.put(avgMap.get(i), i);
////			
//			sortSet.add((Integer)avgMap.get(i));
//		}
//		
//		Iterator<Integer> it =  sortSet.iterator();
//		
//		while(it.hasNext()){
//			avgList.add((Integer) it.next());
//		}
//		Collections.reverse(avgList);
//		
//		System.out.println(sortSet);
//		System.out.println(avgList);
		
		
		String arrName[] = null;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("이름을 입력하세요 : ");
			
			String name = sc.next();
			
			arrName = new String[count+1];  
			
			arrName[count] = name;
			count++;
			
			if(count>1) break;
		}
		
		System.out.println("length : "+arrName.length);
		
	}
}
