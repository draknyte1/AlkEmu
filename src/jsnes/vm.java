package jsnes;

final class vm implements Runnable {
   // $FF: synthetic field
   private dk a;

   vm(dk var1) {
      this.a = var1;
      super();
   }

   public final void run() {
      this.a.fireTableDataChanged();
   }
}
