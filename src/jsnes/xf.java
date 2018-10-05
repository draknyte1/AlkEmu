package jsnes;

final class xf extends kr {
   final kq[] a;
   final ks a;
   final ks b;
   boolean a;
   int a;
   int b;
   int c;
   int d;
   boolean b;
   boolean c;
   boolean d;
   boolean e;
   boolean f;
   final kq[] b;
   int e;
   int f;
   // $FF: synthetic field
   final xx a;

   private xf(xx var1, byte var2) {
      this.a = var1;
      this.a = new kq[128];

      for(int var3 = 0; var3 < 128; ++var3) {
         this.a[var3] = new kq(this.a, var3);
      }

      this.b = new kq[32];
      this.a = new ks(this.a);
      this.b = new ks(this.a);
      this.b = true;
   }

   public final void a() {
      this.a = false;
      this.c = true;
      this.d = false;
      super.a();
   }

   // $FF: synthetic method
   xf(xx var1) {
      this(var1, (byte)0);
   }
}
