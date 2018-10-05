package jsnes;

import java.awt.Color;
import java.awt.Font;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

final class fv {
   static final String a = System.getProperty("line.separator");
   static final Charset a = Charset.forName("US-ASCII");
   static final Font a;

   static String a(int var0) {
      return a(var0, 2);
   }

   static String a(int var0, int var1) {
      char[] var2;
      for(var2 = new char[var1]; var1-- != 0; var0 >>= 4) {
         char var3 = (char)((char)(var0 & 15) + ((char)(var0 & 15) < '\n' ? 48 : 55));
         var2[var1] = var3;
      }

      return new String(var2);
   }

   static String b(int var0) {
      String var1;
      for(var1 = Integer.toBinaryString(var0); var1.length() < 8; var1 = "0" + var1) {
         ;
      }

      return var1;
   }

   static void a(String var0) {
      System.out.println(var0);
   }

   static void a(Object var0) {
      String var1 = var0.toString();
      System.out.println(var1);
   }

   static void a(String var0, Object... var1) {
      var0 = String.format(var0, var1);
      System.out.println(var0);
   }

   static int a(int var0) {
      return 1 << var0;
   }

   static int a(int var0, int var1) {
      return var0 < var1 ? var0 : var1;
   }

   static Color a(Color var0, Color var1, float var2) {
      float[] var5 = var0.getRGBComponents((float[])null);
      float[] var7 = var1.getRGBComponents((float[])null);
      float var3 = (var5[0] + var7[0] * var2) / (var2 + 1.0F);
      float var4 = (var5[1] + var7[1] * var2) / (var2 + 1.0F);
      float var6 = (var5[2] + var7[2] * var2) / (var2 + 1.0F);
      return new Color(var3, var4, var6);
   }

   static Color a(Color var0) {
      return var0.getRed() * 6 + (var0.getBlue() << 2) + var0.getGreen() * 9 < 1500 ? Color.WHITE : Color.BLACK;
   }

   static Border a(String var0, int var1) {
      Object var2 = new TitledBorder(new EtchedBorder(), var0);
      if (var1 > 0) {
         var2 = new CompoundBorder((Border)var2, new EmptyBorder(var1, var1, var1, var1));
      }

      return (Border)var2;
   }

   static Border a(String var0) {
      return a(var0, 0);
   }

   static String a(String var0) {
      Matcher var1;
      return !(var1 = Pattern.compile("([^\\\\\\/]+?)[\\\\\\/]?$").matcher(var0)).find() ? "" : var1.group(1);
   }

   static String a(String var0, String var1) {
      Matcher var2;
      if ((var2 = Pattern.compile("^(.*?)(?:\\.[^.]{1,3})?(?:\\.[^.]{1,3})$").matcher(var0)).find()) {
         var0 = var2.group(1);
      }

      return var0 + "." + var1;
   }

   static {
      Charset.forName("ISO-8859-1");
      a = new Font("Monospaced", 0, 14);
   }
}
