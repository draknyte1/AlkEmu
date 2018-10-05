package jsnes;

abstract class jw {
   public final int c;
   jw a;

   public jw(int var1) {
      this.c = var1;
   }

   public abstract int b(int var1);

   public abstract int a(int var1);

   public abstract void a(int var1, int var2);

   public final int c(int var1) {
      return var1 <= 65535 ? this.b(var1) : this.a.b(var1 & '\uffff');
   }

   public final int d(int var1) {
      return this.b(var1) | this.b(var1 + 1 & '\uffff') << 8;
   }

   public final int e(int var1) {
      int var2 = this.b(var1);
      int var3 = var1 != 65535 ? this.b(var1 + 1) : this.a.b(0);
      return var2 | var3 << 8;
   }

   public final int f(int var1) {
      int var2 = var1 <= 65535 ? this.b(var1) : this.a.b(var1 & '\uffff');
      int var3 = var1 <= 65534 ? this.b(var1 + 1) : this.a.b(var1 + 1 & '\uffff');
      return var2 | var3 << 8;
   }

   public final int g(int var1) {
      int var2 = this.b(var1);
      int var3 = this.b(var1 + 1 & '\uffff');
      int var4 = this.b(var1 + 2 & '\uffff');
      return var2 | var3 << 8 | var4 << 16;
   }

   public final void b(int var1, int var2) {
      if (var1 <= 65535) {
         this.a(var1, var2);
      } else {
         this.a.a(var1 & '\uffff', var2);
      }
   }

   public final void c(int var1, int var2) {
      this.a(var1, var2 & 255);
      this.a(var1 + 1 & '\uffff', var2 >> 8);
   }

   public final void d(int var1, int var2) {
      this.a(var1, var2 & 255);
      if (var1 != 65535) {
         this.a(var1 + 1, var2 >> 8);
      } else {
         this.a.a(0, var2 >> 8);
      }
   }

   public final void e(int var1, int var2) {
      if (var1 < 65535) {
         this.a(var1, var2 & 255);
         this.a(var1 + 1, var2 >> 8);
      } else if (var1 == 65535) {
         this.a(var1, var2 & 255);
         this.a.a(0, var2 >> 8);
      } else {
         this.a.a(var1 & '\uffff', var2 & 255);
         this.a.a(var1 + 1 & '\uffff', var2 >> 8);
      }
   }
}
