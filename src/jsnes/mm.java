package jsnes;

final class mm extends afg {
   // $FF: synthetic field
   private kt a;

   private mm(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 25;
   }

   public final void a() {
      kt.a(this.a, 3);
      kt.a(this.a, (kt.h(this.a) & 4) == 0);
   }

   // $FF: synthetic method
   mm(kt var1) {
      this(var1, (byte)0);
   }
}
