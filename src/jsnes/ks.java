package jsnes;

import java.util.Arrays;

public final class ks {
   private int a;
   private final byte[][] a;
   private final boolean[] a;
   // $FF: synthetic field
   private xx a;

   public ks(xx var1) {
      this.a = var1;
      super();
      this.a = new byte[128][128];
      this.a = new boolean[16];
   }

   public final void a(int var1) {
      var1 &= 32767;
      if (this.a != var1) {
         this.a = var1;
         this.a();
      }

   }

   public final void b(int var1) {
      if ((var1 = (var1 - this.a & 32767) >> 8) < 16) {
         this.a[var1] = false;
      }

   }

   public final void a() {
      Arrays.fill(this.a, false);
   }

   private void c(int var1) {
      int var2 = this.a | var1 >> 3 << 8 | var1 & 7;
      byte[] var7 = this.a[var1];
      int var3 = 0;

      for(int var4 = 16; var4-- != 0; var2 += 16) {
         short var5 = this.a.a[var2 & 32767];
         short var6 = this.a.a[var2 + 8 & 32767];
         var7[var3++] = (byte)((var5 & 128) >> 7 | (var5 & '耀') >> 14 | (var6 & 128) >> 5 | (var6 & '耀') >> 12);
         var7[var3++] = (byte)((var5 & 64) >> 6 | (var5 & 16384) >> 13 | (var6 & 64) >> 4 | (var6 & 16384) >> 11);
         var7[var3++] = (byte)((var5 & 32) >> 5 | (var5 & 8192) >> 12 | (var6 & 32) >> 3 | (var6 & 8192) >> 10);
         var7[var3++] = (byte)((var5 & 16) >> 4 | (var5 & 4096) >> 11 | (var6 & 16) >> 2 | (var6 & 4096) >> 9);
         var7[var3++] = (byte)((var5 & 8) >> 3 | (var5 & 2048) >> 10 | (var6 & 8) >> 1 | (var6 & 2048) >> 8);
         var7[var3++] = (byte)((var5 & 4) >> 2 | (var5 & 1024) >> 9 | var6 & 4 | (var6 & 1024) >> 7);
         var7[var3++] = (byte)((var5 & 2) >> 1 | (var5 & 512) >> 8 | (var6 & 2) << 1 | (var6 & 512) >> 6);
         var7[var3++] = (byte)(var5 & 1 | (var5 & 256) >> 7 | (var6 & 1) << 2 | (var6 & 256) >> 5);
      }

   }

   public final byte[] a(int var1) {
      if (!this.a[var1 >> 3]) {
         int var3 = var1 >> 3;
         this.a[var3] = true;
         var3 <<= 3;
         this.c(var3++);
         this.c(var3++);
         this.c(var3++);
         this.c(var3++);
         this.c(var3++);
         this.c(var3++);
         this.c(var3++);
         this.c(var3);
      }

      return this.a[var1];
   }
}
