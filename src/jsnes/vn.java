package jsnes;

final class vn {
   private int h;
   final int a;
   private String b;
   private String c;
   final String a;
   final int b;
   private int i;
   private int j;
   private int k;
   final int c;
   final int d;
   final int e;
   final int f;
   final int g;
   private int l;
   private int m;
   private int n;

   vn(ea var1, int var2) {
      this(var1, var2, 0);
   }

   vn(ea var1, int var2, int var3) {
      this.h = var2;
      this.b = var1.a(var2, 2);
      this.c = var1.a(var2 + 2, 4);
      this.f = var1.a(var2 + 13);
      this.k = var1.a(var2 + 14);
      this.i = var1.a(var2 + 15);
      this.a = var1.a(var2 + 16, 21);
      this.c = var1.a(var2 + 37);
      this.b = var1.a(var2 + 38);
      this.d = var1.a(var2 + 39);
      this.e = var1.a(var2 + 40);
      this.g = var1.a(var2 + 41);
      this.l = var1.a(var2 + 42);
      this.j = var1.a(var2 + 43);
      this.n = var1.b(var2 + 44);
      this.m = var1.b(var2 + 46);
      int var4 = var3;
      if (this.c >= 32 && this.c <= 53) {
         var4 = var3 + 10;
      }

      if (var2 == 32688 && (this.c == 32 || this.c == 48 || this.c == 35) || var2 == 65456 && (this.c == 33 || this.c == 49) || var2 == 4259760 && (this.c == 37 || this.c == 53)) {
         var4 += 40;
      }

      if (this.d >= 9 && this.d <= 13) {
         var4 += 10;
      }

      if (this.e >= 0 && this.e <= 7) {
         var4 += 10;
      }

      if (this.f <= 7) {
         var4 += 10;
      }

      if (this.l == 51) {
         var4 += 50;
      }

      if ((this.m + this.n & '\uffff') == 65535) {
         var4 += 100;
      }

      this.a = var4;
   }

   public final String toString() {
      return String.format("Cartridge info header at ROM address 0x%06X (score: %d)\n\tMaker code %s\n\tGame code: %s\n\tGame title: %s\n\tCartridge type: 0x%02X\n\tCartridge sub-type: 0x%02X\n\tMask ROM version: %d\n\tSpecial version: %d\n\tMap mode: 0x%02X\n\tROM size: 0x%02X\n\tSRAM size: 0x%02X\n\tExpansion RAM: 0x%02X\n\tRegion code: 0x%02X\n\tMagic number: 0x%02X\n\tChecksum: 0x%04X\n\tComplement checksum: 0x%04X", this.h, this.a, this.b, this.c, this.a, this.b, this.i, this.j, this.k, this.c, this.d, this.e, this.f, this.g, this.l, this.m, this.n);
   }
}
