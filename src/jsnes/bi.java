package jsnes;

import java.awt.Canvas;
import java.awt.Container;
import java.awt.RenderingHints;
import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

final class bi {
   public static bi a;
   final JFrame a;
   final JRootPane a;
   final Container a;
   Canvas a;
   private final Map b;
   final Map a;
   public final afi a;
   boolean a;
   boolean b;
   ea a;
   byte[] a;
   File a;
   boolean c;
   yi a;
   JFileChooser a;
   JFileChooser b;
   JFileChooser c;
   xn a;

   bi(String[] var1, byte var2) {
      this(var1);
   }

   private bi(String[] var1) {
      this.b = new HashMap();
      this.a = Collections.synchronizedMap(new HashMap());
      this.a = false;
      this.b = false;
      this.c = true;
      a = this;
      JFrame.setDefaultLookAndFeelDecorated(false);

      try {
         UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      } catch (Throwable var3) {
         ;
      }

      this.a = new JFrame("JSNES");
      this.a = this.a.getRootPane();
      this.a = this.a.getContentPane();
      this.b.put(Integer.valueOf(65), Integer.valueOf(16384));
      this.b.put(Integer.valueOf(90), Integer.valueOf(32768));
      this.b.put(Integer.valueOf(83), Integer.valueOf(64));
      this.b.put(Integer.valueOf(88), Integer.valueOf(128));
      this.b.put(Integer.valueOf(38), Integer.valueOf(2048));
      this.b.put(Integer.valueOf(40), Integer.valueOf(1024));
      this.b.put(Integer.valueOf(37), Integer.valueOf(512));
      this.b.put(Integer.valueOf(39), Integer.valueOf(256));
      this.b.put(Integer.valueOf(10), Integer.valueOf(4096));
      this.b.put(Integer.valueOf(8), Integer.valueOf(8192));
      this.b.put(Integer.valueOf(98), Integer.valueOf(32768));
      this.b.put(Integer.valueOf(100), Integer.valueOf(16384));
      this.b.put(Integer.valueOf(102), Integer.valueOf(128));
      this.b.put(Integer.valueOf(104), Integer.valueOf(64));
      this.b.put(Integer.valueOf(111), Integer.valueOf(32));
      this.b.put(Integer.valueOf(106), Integer.valueOf(16));
      this.a = new afi();
      bi var4 = this;

      try {
         SwingUtilities.invokeAndWait(new by(var4));
      } catch (Throwable var2) {
         ;
      }
   }

   public final void a() {
      this.a.a(true);
   }

   public final void b() {
      ow.b();
      yi var1 = this.a;
      if (this.a != null) {
         this.a = null;
         var1.interrupt();
      }

      if (ow.g && this.a != null) {
         int var2;
         for(var2 = 0; var2 < this.a.b.length && this.a[var2] == this.a.b[var2]; ++var2) {
            ;
         }

         if (var2 < this.a.b.length) {
            this.e();
         }
      }

      this.a.b();
      this.a.dispose();
   }

   public final v a(cb var1) {
      Object var2;
      if ((var2 = (v)this.a.get(var1)) == null) {
         var2 = new ee(var1);
         this.a.put(var1, var2);
      }

      return (v)var2;
   }

   public final void a(Object var1) {
      this.c = true;

      try {
         xk var2 = new xk(var1, new jn(this));
         this.a = new ea(var2);
      } catch (Throwable var3) {
         a("There was an error loading the ROM.", var3);
         return;
      }

      this.a.a(this.a);
      this.a = new byte[this.a.b.length];

      for(int var4 = 0; var4 < this.a.b.length; ++var4) {
         this.a[var4] = this.a.b[var4];
      }

      if (this.a.b.length != 0) {
         this.a = a(var1);
         if (ow.f) {
            this.d();
         }
      } else {
         this.a = null;
      }

      if (var1 instanceof File) {
         File var5 = (File)var1;
         ow.a.a(var5.getPath());
         this.c.setCurrentDirectory(var5);
         this.b.setCurrentDirectory(var5);
      }

      this.b = true;
      this.a.a(false);
      this.c = false;
   }

   public static void a(String var0, Throwable var1) {
      if (var1 != null) {
         var0 = var0 + "\n\nDetails:\n" + var1.toString() + "\n";
      }

      JOptionPane.showMessageDialog(a.a, var0, "Sorry", 0);
   }

   final void c() {
      this.a.a().a(ow.c);
      this.a.a().b(ow.d);
      wl var10000 = this.a.a();
      int var1 = ow.b;
      wl var2 = var10000;
      Object var4;
      switch(var1) {
      case 0:
         var4 = RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR;
         break;
      case 1:
         var4 = RenderingHints.VALUE_INTERPOLATION_BILINEAR;
         break;
      case 2:
         var4 = RenderingHints.VALUE_INTERPOLATION_BICUBIC;
         break;
      default:
         throw new IllegalArgumentException();
      }

      var10000 = var2;
      Object var3 = var4;
      Key var5 = RenderingHints.KEY_INTERPOLATION;
      var10000.a.setRenderingHint(var5, var3);
   }

   private static File a(Object var0) {
      if (var0 instanceof File) {
         String var5 = fv.a(((File)var0).toString(), "srm");
         File var1 = new File(var5);
         File var6 = new File(ow.a(ow.a).toString(), fv.a(var5));
         if (!ow.h) {
            File var2 = var6;
            var6 = var1;
            var1 = var2;
         }

         try {
            if (var1.exists()) {
               return var1;
            }
         } catch (SecurityException var4) {
            ;
         }

         try {
            if (var6.exists()) {
               return var6;
            }
         } catch (SecurityException var3) {
            ;
         }

         return var1;
      } else {
         return null;
      }
   }

   final void d() {
      if (this.a != null) {
         if (this.a != null) {
            fv.a("Load SRAM from " + this.a);
            this.c = true;

            byte[] var1;
            try {
               var1 = hu.a(this.a, (jn)null);
            } catch (Exception var3) {
               fv.a("Load SRAM failed: " + var3);
               if (!(var3 instanceof FileNotFoundException)) {
                  a((String)"Error reading SRAM file", (Throwable)var3);
               }

               return;
            }

            for(int var2 = 0; var2 < this.a.b.length; ++var2) {
               this.a.b[var2] = var1[var2 % var1.length];
               this.a[var2] = this.a.b[var2];
            }

            this.c = false;
            fv.a("Load SRAM success");
         }
      }
   }

   final void e() {
      if (this.a != null) {
         this.c = true;

         for(int var1 = 0; var1 < this.a.b.length; ++var1) {
            this.a[var1] = this.a.b[var1];
         }

         if (this.a != null) {
            fv.a("Save SRAM to " + this.a);
            this.a.getParentFile().mkdirs();

            try {
               FileOutputStream var3;
               (var3 = new FileOutputStream(this.a)).write(this.a);
               var3.close();
            } catch (Exception var2) {
               fv.a("Save SRAM failed: " + var2);
               a((String)"Error saving SRAM file", (Throwable)var2);
            }

            fv.a("Save SRAM success");
         }

         this.c = false;
      }
   }

   // $FF: synthetic method
   static int a(bi var0, KeyEvent var1) {
      Integer var2;
      return (var2 = (Integer)var0.b.get(var1.getKeyCode())) != null ? var2.intValue() : 0;
   }
}
