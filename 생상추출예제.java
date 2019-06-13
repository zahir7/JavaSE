package color;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

import javax.imageio.ImageIO;

public class MainC {

   public static void main(String args[]) throws IOException {

      int topColor = 5;
      
      File file = new File("이미지 경로!\logo.png");
      
      if(!file.exists()){
         System.out.println("존재하지 않는 파일입니다.");
      }
      BufferedImage image = ImageIO.read(file);
      // int clr;
      int redd = 0;
      int greenn = 0;
      int bluee = 0;

      ArrayList<String> colorList = new ArrayList<String>();

      for (int i = 0; i < image.getHeight(); i++) {
         for (int j = 0; j < image.getWidth(); j++) {
            int clr = image.getRGB(j, i);

            redd = (clr & 0x00ff0000) >> 16;
            greenn = (clr & 0x0000ff00) >> 8;
            bluee = clr & 0x000000ff;
            colorList.add(redd + "," + greenn + "," + bluee);

         }
      }
      List<Entry<String, Integer>> greatest = countFrequencies(colorList, topColor);

      System.out.println("Top " + topColor + " entries:");
      for (Entry<String, Integer> entry : greatest) {
         System.out.println(entry);
      }

   }

   public static List<Entry<String, Integer>> countFrequencies(ArrayList<String> list, int n) {

      Set<String> st = new HashSet<String>(list);
      Map<String, Integer> map = new HashMap<String, Integer>();

      for (String s : st) {
//         System.out.println(s + ": " + Collections.frequency(list, s));
         map.put(s, Collections.frequency(list, s));
      }

      List<Entry<String, Integer>> greatest = findGreatest(map, n);

      return greatest;

   }

   private static <K, V extends Comparable<? super V>> List<Entry<K, V>> findGreatest(Map<K, V> map, int n) {
      Comparator<? super Entry<K, V>> comparator = new Comparator<Entry<K, V>>() {
         @Override
         public int compare(Entry<K, V> e0, Entry<K, V> e1) {
            V v0 = e0.getValue();
            V v1 = e1.getValue();
            return v0.compareTo(v1);
         }
      };
      PriorityQueue<Entry<K, V>> highest = new PriorityQueue<Entry<K, V>>(n, comparator);
      for (Entry<K, V> entry : map.entrySet()) {
         highest.offer(entry);
         while (highest.size() > n) {
            highest.poll();
         }
      }

      List<Entry<K, V>> result = new ArrayList<Map.Entry<K, V>>();
      while (highest.size() > 0) {
         result.add(highest.poll());
      }
      return result;
   }
}
