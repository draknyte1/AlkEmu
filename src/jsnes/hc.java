package jsnes;

final class hc extends afg {
   // $FF: synthetic field
   private kt a;

   private hc(kt var1, byte var2) {
      this.a = var1;
      super();
      this.a = 31;
      this.b = 23;
   }

   public final void a() {
      kt.a(this.a, 3);
      kt.a(this.a, (kt.h(this.a) & 1) == 0);
   }

   // $FF: synthetic method
   hc(kt var1) {
      this(var1, (byte)0);
   }
}
