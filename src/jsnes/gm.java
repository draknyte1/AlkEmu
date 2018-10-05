package jsnes;

final class gm extends afg {
   // $FF: synthetic field
   private kt a;

   private gm(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 15;
      this.b = 3;
   }

   public final void a() {
      int var1 = kt.b(this.a);
      kt.a(this.a, kt.r(this.a), var1);
      kt.a(this.a, 4);
   }

   // $FF: synthetic method
   gm(kt var1) {
      this(var1, (byte)0);
   }
}
