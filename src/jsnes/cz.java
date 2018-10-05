package jsnes;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;

final class cz {
   private static final int[] a;
   private static final int[] b;
   private static final byte[] a;
   private static final int[] c;
   private Mixer a;
   private SourceDataLine a;
   private final byte[] b = new byte[128];
   private int a;
   private int b;
   private int c;
   private final it[] a = new it[8];

   public cz(byte[] var1) {
      for(int var5 = 0; var5 < 8; ++var5) {
         this.a[var5] = new it();
      }

      cz var4;
      (var4 = this).a = null;
      var4.a = null;
      var4.a = AudioSystem.getMixer((Info)null);
      if (var4.a != null) {
         AudioFormat var6 = new AudioFormat(32000.0F, 16, 1, true, false);
         javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(SourceDataLine.class, var6, 32000);

         try {
            var4.a = (SourceDataLine)AudioSystem.getLine(var2);
            var4.a.open(var6);
            var4.a.start();
            return;
         } catch (Throwable var3) {
            ;
         }
      }

   }

   public final int a(int var1) {
      return this.b[var1] & 255;
   }

   public final void a(int var1, int var2) {
      ++this.a;
      this.b[var1] = (byte)var2;
   }

   public final void a(byte[] var1) {
      for(int var2 = 0; var2 < this.b.length; ++var2) {
         this.b[var2] = var1[var2];
      }

      ++this.a;
   }

   public final void a(int var1) {
      for(var1 += this.c; var1 > 31; var1 -= 32) {
         if (this.a != this.b) {
            this.b = this.a;
         }
      }

      this.c = var1;
   }

   static {
      int[] var10000 = new int[]{Integer.MAX_VALUE, 2048, 1536, 1280, 1024, 768, 640, 512, 384, 320, 256, 192, 160, 128, 96, 80, 64, 48, 40, 32, 24, 20, 16, 12, 10, 8, 6, 5, 4, 3, 2, 1};
      var10000 = new int[]{64, 40, 24, 16, 10, 6, 4, 2};
      b = new int[(a = new int[]{4100, 2600, 1500, 1000, 640, 380, 260, 160, 96, 64, 40, 24, 16, 10, 6, 0}).length];

      int var0;
      int var1;
      for(var1 = 0; var1 < a.length; ++var1) {
         var0 = a[var1] << 5;
         b[var1] = var0 / 64;
      }

      a = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 3, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 3, 3, 2, 3, 2, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 3, 4, 3, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 4, 4, 3, 4, 4, 4, 3, 4, 4, 4, 4, 4, 4, 3, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 4, 5, 4, 4, 4, 5, 4, 4, 5, 4, 4, 5, 4, 5, 4, 4, 5, 4, 5, 4, 5, 5, 4, 5, 4, 5, 5, 4, 5, 4, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 5, 4, 5, 5, 5, 5, 4, 5, 5, 5, 4, 5, 5, 4, 5, 5, 4, 5, 5, 4, 5, 4, 5, 5, 4, 5, 4, 4, 5, 4, 5, 4, 4, 5, 4, 4, 5, 4, 4, 4, 4, 5, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 3, 4, 4, 4, 4, 3, 4, 4, 3, 4, 3, 4, 3, 4, 3, 4, 3, 3, 4, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 2, 3, 3, 2, 3, 2, 3, 2, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0};
      c = new int[512];
      var0 = 0;

      for(var1 = 0; var0 < 512; ++var0) {
         c[var0] = var1 += a[var0];
      }

   }
}
