package jsnes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class ow {
   private static final xj a;
   private static File a;
   static int a;
   static boolean a;
   static boolean b;
   static boolean c;
   static boolean d;
   static int b;
   static boolean e;
   static yk a;
   static String a;
   static boolean f;
   static boolean g;
   static boolean h;

   private static void a(xj var0) {
      a = var0.a("traceLogLength");
      a = var0.a("traceOpBytes");
      b = var0.a("allowConflictingJoypadDirections");
      c = var0.a("stretch");
      d = var0.a("correctAspectRatio");
      String var2 = "interpolation";
      xj var1 = var0;

      int var10000;
      while(true) {
         int var3;
         if ((var3 = var1.a(var2)) < 0) {
            if (var1.a == null) {
               var10000 = 0;
               break;
            }

            var1 = var1.a;
         } else {
            if (var3 > 2) {
               if (var1.a != null) {
                  var1 = var1.a;
                  continue;
               }

               var10000 = 2;
               break;
            }

            var10000 = var3;
            break;
         }
      }

      b = var10000;
      e = var0.a("alternateFrameRendering");
      String var4;
      yk var9;
      if ((var4 = var0.getProperty("recentGames")) != null && Pattern.matches("^(?:\".+?\"[,\\s]*)*$", var4)) {
         yk var5 = new yk();
         Matcher var6 = Pattern.compile("\"(.+?)\"").matcher(var4);

         while(var6.find() && var5.a() != var5.a) {
            String var8 = var6.group(1).replace("%22", "\"").replace("%25", "%");
            var5.a.add(var8);
         }

         var9 = var5;
      } else {
         var9 = null;
      }

      yk var7 = var9;
      a = var9 != null ? var7 : new yk();
      a = var0.getProperty("sramFolder");
      f = var0.a("sramLoadAutomatically");
      g = var0.a("sramSaveAutomatically");
      h = var0.a("sramUseROMFolder");
   }

   private static File a() {
      String var1 = "jsnes.ini";
      String var2 = "." + var1;
      String var0 = null;

      try {
         var0 = System.getProperty("user.dir");
      } catch (SecurityException var11) {
         ;
      }

      File var3;
      if (var0 != null) {
         var3 = new File(var0, var1);

         try {
            if (var3.exists()) {
               return var3;
            }
         } catch (SecurityException var10) {
            ;
         }

         var3 = new File(var0, var2);

         try {
            if (var3.exists()) {
               return var3;
            }
         } catch (SecurityException var9) {
            ;
         }
      }

      var0 = null;

      try {
         var0 = System.getenv("APPDATA");
      } catch (SecurityException var8) {
         ;
      }

      if (var0 != null) {
         var3 = new File(var0, var1);

         try {
            if (var3.exists()) {
               return var3;
            }
         } catch (SecurityException var5) {
            ;
         }

         var3 = new File(var0, var2);

         try {
            if (var3.exists()) {
               return var3;
            }
         } catch (SecurityException var4) {
            ;
         }

         return new File(var0, var1);
      } else {
         var0 = null;

         try {
            var0 = System.getProperty("user.home");
         } catch (SecurityException var7) {
            ;
         }

         if (var0 != null) {
            var3 = new File(var0, var1);

            try {
               if (var3.exists()) {
                  return var3;
               }
            } catch (SecurityException var6) {
               ;
            }

            return new File(var0, var2);
         } else {
            return null;
         }
      }
   }

   public static void a() {
      if (a != null) {
         try {
            if (!a.exists()) {
               return;
            }
         } catch (SecurityException var3) {
            return;
         }

         try {
            FileInputStream var0 = new FileInputStream(a);
            xj var1;
            (var1 = new xj(a)).load(var0);
            a(var1);
            return;
         } catch (Exception var2) {
            bi.a((String)"There was an error reading the JSNES settings file.", (Throwable)var2);
         }
      }

   }

   public static void b() {
      if (a != null) {
         try {
            FileOutputStream var0 = new FileOutputStream(a);
            xj var1;
            xj var2;
            (var2 = var1 = new xj(a)).clear();
            var2.a("traceLogLength", a);
            var2.a("traceOpBytes", a);
            var2.a("allowConflictingJoypadDirections", b);
            var2.a("stretch", c);
            var2.a("correctAspectRatio", d);
            var2.a("interpolation", b);
            var2.a("alternateFrameRendering", e);
            var2.setProperty("recentGames", a.toString());
            var2.setProperty("sramFolder", a);
            var2.a("sramLoadAutomatically", f);
            var2.a("sramSaveAutomatically", g);
            var2.a("sramUseROMFolder", h);
            var1.a();
            var1.store(var0, (String)null);
            return;
         } catch (Exception var3) {
            bi.a((String)"There was an error saving the JSNES settings file.", (Throwable)var3);
         }
      }

   }

   public static File a(String var0) {
      File var1;
      if (!(var1 = new File(var0)).isAbsolute()) {
         String var3 = "";

         try {
            var3 = System.getProperty("user.dir");
         } catch (SecurityException var2) {
            ;
         }

         var1 = new File(var3, var0);
      }

      return var1;
   }

   static {
      (a = new xj()).a("traceLogLength", 65536);
      a.a("traceOpBytes", false);
      a.a("allowConflictingJoypadDirections", false);
      a.a("stretch", true);
      a.a("correctAspectRatio", true);
      a.a("interpolation", 0);
      a.a("alternateFrameRendering", false);
      a.setProperty("recentGames", "");
      a.setProperty("sramFolder", "saves");
      a.a("sramLoadAutomatically", true);
      a.a("sramSaveAutomatically", true);
      a.a("sramUseROMFolder", true);
      a(a);
      a = a();
      fv.a("Options file path: " + a);
      a();
   }
}
