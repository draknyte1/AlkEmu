package jsnes;

abstract class afc {
   public int a;

   private afc(byte var1) {
      this.a = 1;
   }

   public abstract void a();

   // $FF: synthetic method
   afc() {
      this((byte)0);
   }
}
