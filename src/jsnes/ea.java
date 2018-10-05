package jsnes;

import java.util.Arrays;

final class ea {
   final byte[] a;
   private int b;
   private int c;
   private int d;
   final int a;
   private boolean b;
   final boolean a;
   final byte[] b;

   ea(xk var1) {
      byte[] var6;
      if ((var6 = var1.a).length % 512 != 0) {
         var6 = Arrays.copyOfRange(var6, 0, var6.length / 512 << 9);
      }

      if (var6.length % 4096 != 0) {
         var6 = Arrays.copyOfRange(var6, var6.length % 4096, var6.length);
         fv.a("SNESCartridge: Removing unknown 512-byte header(s)");
      }

      this.a = var6;
      vn var3 = new vn(this, 32688, this.a.length < 2097152 ? 50 : 0);
      vn var4 = new vn(this, 65456);
      vn var2 = new vn(this, 4259760);
      vn var5 = var3;
      if (var3.a < var4.a) {
         var5 = var4;
      }

      if (var5.a < var2.a) {
         var5 = var2;
      }

      vn var10000;
      if (var5.a < 75) {
         fv.a("SNESCartridge: Uncertain of header location, so listing all:");
         System.out.println(var3);
         System.out.println(var4);
         System.out.println(var2);
         var10000 = null;
      } else {
         var10000 = var5;
      }

      var2 = var10000;
      byte var7;
      if (var10000 != null) {
         fv.a("SNESCartridge: Game title: " + var2.a);
         if (var2.d >= 9 && var2.d <= 13) {
            this.b = fv.a(var2.d + 10);
         } else {
            fv.a("SNESCartridge: Invalid ROM size byte: 0x" + fv.a(var2.d));
            this.b = fv.a(19);
         }

         fv.a("SNESCartridge: ROM size: " + this.b + " bytes");
         if (var2.e <= 7) {
            this.c = var2.e != 0 ? fv.a(var2.e + 10) : 0;
         } else {
            fv.a("SNESCartridge: Invalid SRAM size byte: 0x" + fv.a(var2.e));
            this.c = 0;
         }

         fv.a("SNESCartridge: SRAM size: " + this.c + " bytes");
         if (var2.f <= 7) {
            this.d = var2.f != 0 ? fv.a(var2.f + 10) : 0;
         } else {
            fv.a("SNESCartridge: Invalid expansion RAM size byte: 0x" + fv.a(var2.f));
            this.d = 0;
         }

         fv.a("SNESCartridge: Expansion RAM size: " + this.d + " bytes");
         if (var2.b >= 3) {
            fv.a("SNESCartridge: WARNING: Unsupported cartridge co-processor");
         }

         switch(var2.c) {
         case 32:
            var7 = 20;
            this.b = false;
            break;
         case 33:
            var7 = 21;
            this.b = false;
            break;
         case 37:
            var7 = 25;
            this.b = false;
            break;
         case 48:
            var7 = 20;
            this.b = true;
            break;
         case 49:
            var7 = 21;
            this.b = true;
            break;
         case 53:
            var7 = 25;
            this.b = true;
            break;
         default:
            fv.a("SNESCartridge: Invalid map mode value: 0x" + fv.a(var2.c));
            var7 = 0;
            this.b = false;
         }
      } else {
         var2 = new vn(this, 32688);
         this.b = var6.length;
         this.c = 0;
         this.d = 0;
         var7 = 0;
         this.b = false;
         fv.a("SNESCartridge: WARNING! ROM info header not found!");
      }

      this.b = new byte[this.c];

      for(int var8 = 0; var8 < this.c; ++var8) {
         this.b[var8] = 96;
      }

      if (var7 == 0) {
         if (var6.length > 2097152) {
            var7 = 21;
         } else {
            var7 = 20;
         }
      }

      if (var2.g != 0 && var2.g != 1) {
         this.a = true;
      } else {
         this.a = false;
      }

      this.a = var7;
      fv.a("SNESCartridge: Map mode " + var7);
      fv.a("SNESCartridge: Supports CPU speed " + (this.b ? "3.58" : "2.68") + " MHz");
   }

   final int a(int var1) {
      try {
         return this.a[var1] & 255;
      } catch (ArrayIndexOutOfBoundsException var2) {
         return 0;
      }
   }

   final int b(int var1) {
      return this.a(var1) | this.a(var1 + 1) << 8;
   }

   final String a(int var1, int var2) {
      return var1 + var2 - 1 < this.a.length ? (new String(this.a, var1, var2, fv.a)).trim() : "";
   }
}
