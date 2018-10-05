package jsnes;

import java.awt.Color;
import java.awt.Graphics;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class hu {
   static byte[] a(File var0, jn var1) {
      FileInputStream var2;
      return a(var2 = new FileInputStream(var0), var1, 0, (int)var2.getChannel().size());
   }

   static byte[] a(InputStream var0, jn var1, int var2, int var3) {
      ByteArrayOutputStream var4 = new ByteArrayOutputStream();
      byte[] var5 = new byte[8192];

      while(true) {
         if (var1 != null) {
            int var7 = var4.size();
            Graphics var8;
            (var8 = var1.a.a.getGraphics()).setColor(Color.WHITE);
            var8.fillRect(0, 0, var1.a.a.getWidth(), 20);
            var8.setColor(Color.BLACK);
            String var6 = String.format("Loading (%d): %d of %d", var2, var7, var3);
            var8.drawString(var6, 0, 20);
         }

         int var9;
         if ((var9 = var0.read(var5)) == -1) {
            return var4.toByteArray();
         }

         var4.write(var5, 0, var9);
      }
   }

   static boolean a(String var0) {
      return var0.toLowerCase().endsWith(".zip");
   }
}
