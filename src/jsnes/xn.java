package jsnes;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

final class xn implements ActionListener, ChangeListener {
   private JFrame a;
   private JPanel a;
   private JButton a;
   private JButton b;
   private JButton c;
   private JButton d;
   private JButton e;
   private JButton f;
   private JPanel b;
   private JButton g;
   private JButton h;
   private JLabel a;
   private JSlider a;
   private JPanel c;
   private JPanel d;
   private JLabel b;
   private JComboBox a;
   private JButton i;
   private JPanel e;
   private JLabel c;
   private final bi a;
   private aee a;
   private hm a;
   private nl a;
   private String a;
   private static final afm[] a = new afm[]{new afm("Jungle Hijinx", 22), new afm("        Kong's Cabin", 92), new afm("        Banana Hoard (empty)", 71), new afm("        Banana Hoard (full)", 76), new afm("        Bonus 1", 6), new afm("        Bonus 2", 26), new afm("Ropey Rampage", 12), new afm("        Bonus 1", 28), new afm("        Bonus 2", 27), new afm("Reptile Rumble", 1), new afm("        Bonus 1", 2), new afm("        Bonus 2", 72), new afm("        Bonus 3", 4), new afm("Coral Capers", 191), new afm("Barrel Cannon Canyon", 23), new afm("        Bonus 1", 70), new afm("        Bonus 2", 93), new afm("Very Gnawty's Lair", 224), new afm("Winky's Walkway", 217), new afm("        Bonus 1", 79), new afm("Mine Cart Carnage", 46), new afm("Bouncy Bonanza", 7), new afm("        Bonus 1", 151), new afm("        Bonus 2", 17), new afm("Stop & Go Station", 49), new afm("        Bonus 1", 75), new afm("        Bonus 2", 74), new afm("Millstone Mayhem", 66), new afm("        Bonus 1", 85), new afm("        Bonus 2", 86), new afm("        Bonus 3", 87), new afm("Necky's Nuts", 225), new afm("Vulture Culture", 165), new afm("        Bonus 1", 183), new afm("        Bonus 2", 184), new afm("        Bonus 3", 185), new afm("Tree Top Town", 164), new afm("        Bonus 1", 180), new afm("        Bonus 2", 179), new afm("Forest Frenzy", 208), new afm("        Bonus 1", 220), new afm("        Bonus 2", 212), new afm("Temple Tempest", 67), new afm("        Bonus 1", 82), new afm("        Bonus 2", 83), new afm("Orang-utan Gang", 13), new afm("        Bonus 1", 32), new afm("        Bonus 2", 31), new afm("        Bonus 3", 30), new afm("        Bonus 4", 91), new afm("        Bonus 5", 90), new afm("Clam City", 222), new afm("Bumble B Rumble", 229), new afm("Snow Barrel Blast", 36), new afm("        Bonus 1", 103), new afm("        Bonus 2", 105), new afm("        Bonus 3", 102), new afm("Slipslide Ride", 109), new afm("        Bonus 1", 202), new afm("        Bonus 2", 197), new afm("        Bonus 3", 198), new afm("Ice Age Alley", 167), new afm("        Bonus 1", 106), new afm("        Bonus 2", 107), new afm("Croctopus Chase", 62), new afm("Torchlight Trouble", 20), new afm("        Bonus 1", 193), new afm("        Bonus 2", 195), new afm("Rope Bridge Rumble", 206), new afm("        Bonus 1", 213), new afm("        Bonus 2", 215), new afm("Really Gnawty Rampage", 226), new afm("Oil Drum Alley", 64), new afm("        Bonus 1", 99), new afm("        Bonus 2", 97), new afm("        Bonus 3", 190), new afm("        Bonus 4", 64), new afm("Trick Track Trek", 47), new afm("        Bonus 1", 161), new afm("        Bonus 2", 158), new afm("        Bonus 3", 157), new afm("Elevator Antics", 24), new afm("        Bonus 1", 154), new afm("        Bonus 2", 155), new afm("        Bonus 3", 156), new afm("Poison Pond", 34), new afm("Mine Cart Madness", 39), new afm("        Bonus 1", 77), new afm("        Bonus 2", 160), new afm("        Bonus 3", 162), new afm("Blackout Basement", 65), new afm("        Bonus 1", 100), new afm("        Bonus 2", 163), new afm("Boss Dumb Drum", 227), new afm("Tanked Up Trouble", 48), new afm("        Bonus 1", 159), new afm("Manic Mincers", 18), new afm("        Bonus 1", 5), new afm("        Ledge room", 153), new afm("        Bonus 3", 152), new afm("Misty Mine", 10), new afm("        Bonus 1", 51), new afm("        Bonus 2", 50), new afm("Loopy Lights", 54), new afm("        Bonus 1", 73), new afm("        Bonus 2", 55), new afm("Platform Perils", 43), new afm("        Bonus 1", 78), new afm("        Bonus 2", 80), new afm("Necky's Revenge", 228), new afm("Gangplank Galleon", 104), new afm("Ending Credits", 94), new afm("BONUS: Expresso", 108), new afm("BONUS: Enguarde", 166), new afm("BONUS: Rambi", 210), new afm("BONUS: Winky", 211), new afm("DEBUG: Animal Token Room", 52)};

   public xn(bi var1) {
      this.a = var1;
      this.b();
   }

   private void b() {
      this.a = new JFrame("Debugger");
      Box var1;
      (var1 = new Box(3)).setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
      this.a = new JPanel();
      this.a = new JButton("Memory");
      this.a.setMnemonic(77);
      this.a.addActionListener(this);
      this.a.add(this.a);
      this.b = new JButton("Palette");
      this.b.setMnemonic(80);
      this.b.addActionListener(this);
      this.a.add(this.b);
      this.c = new JButton("Sprites");
      this.c.setMnemonic(83);
      this.c.addActionListener(this);
      this.a.add(this.c);
      this.d = new JButton("Backgrounds");
      this.d.setMnemonic(66);
      this.d.addActionListener(this);
      this.a.add(this.d);
      this.e = new JButton("CPU");
      this.e.setMnemonic(67);
      this.e.addActionListener(this);
      this.a.add(this.e);
      this.f = new JButton("APU");
      this.f.setMnemonic(65);
      this.f.addActionListener(this);
      this.a.add(this.f);
      var1.add(this.a);
      this.b = new JPanel();
      this.b.setBorder(fv.a("Emulation", 5));
      this.b.setLayout(new BoxLayout(this.b, 3));
      Box var2 = new Box(2);
      this.g = new JButton("Step frame");
      this.g.setMnemonic(70);
      this.g.addActionListener(this);
      var2.add(this.g);
      var2.add(Box.createRigidArea(new Dimension(10, 0)));
      var2.add(Box.createHorizontalGlue());
      var2.add(Box.createRigidArea(new Dimension(10, 0)));
      this.h = new JButton("Reset");
      this.h.setMnemonic(82);
      this.h.addActionListener(this);
      var2.add(this.h);
      Box var3 = new Box(2);
      this.a = new JLabel("Target speed (%):");
      var3.add(this.a);
      var3.add(Box.createRigidArea(new Dimension(5, 0)));
      this.a = new JSlider(0, 200, 100);
      this.a.setMajorTickSpacing(20);
      this.a.setMinorTickSpacing(5);
      this.a.setPaintLabels(true);
      this.a.setPaintTicks(true);
      this.a.setSnapToTicks(true);
      this.a.addChangeListener(this);
      var3.add(this.a);
      this.b.add(var2);
      this.b.add(Box.createRigidArea(new Dimension(0, 5)));
      this.b.add(var3);
      var1.add(this.b);
      this.c = new JPanel();
      this.c.setBorder(fv.a("Hacks", 5));
      this.c.setLayout(new BoxLayout(this.c, 3));
      this.d = new JPanel();
      this.b = new JLabel("DKC level jump:");
      this.d.add(this.b);
      this.a = new JComboBox();
      afm[] var6 = a;
      int var7 = a.length;

      for(int var4 = 0; var4 < var7; ++var4) {
         afm var5 = var6[var4];
         this.a.addItem(var5);
      }

      this.a.setMaximumRowCount(15);
      this.d.add(this.a);
      this.i = new JButton("Go");
      this.i.addActionListener(this);
      this.d.add(this.i);
      this.c.add(this.d);
      var1.add(this.c);
      this.e = new JPanel();
      this.e.setBorder(fv.a("Stats", 5));
      this.c = new JLabel(" ");
      this.e.add(this.c);
      var1.add(this.e);
      this.a.add(var1);
      this.a.pack();
      this.a.setResizable(false);
      this.a.setLocation(600, 0);
      this.d.setEnabled(false);
      this.g.setEnabled(false);
      this.a = new nl(this);
      this.a.start();
   }

   public final void a() {
      this.a.setVisible(true);
   }

   public final void actionPerformed(ActionEvent var1) {
      Object var2;
      if ((var2 = var1.getSource()) == this.a) {
         if (this.a == null) {
            this.a = new aee(this.a.a);
         }

         aee var6 = this.a;
         SwingUtilities.invokeLater(new wq(var6));
      } else if (var2 == this.b) {
         if (this.a == null) {
            this.a = new hm(this.a.a);
         }

         hm var5 = this.a;
         SwingUtilities.invokeLater(new abe(var5));
      } else if (var2 == this.c) {
         new afl(this.a.a);
      } else if (var2 == this.e) {
         this.a.a((cb)this.a.a.a).c();
      } else if (var2 == this.f) {
         this.a.a((cb)this.a.a.a).c();
      } else if (var2 == this.h) {
         this.a.a.a();
      } else {
         if (var2 == this.i) {
            afm var3 = (afm)this.a.getSelectedItem();
            int var4 = var3.a;
            this.a.a.a.a[62] = (byte)var4;
            ((jq)this.a.a.a.a).a(32768);
            ((jq)this.a.a.a.a).b(32768);
         }

      }
   }

   public final void stateChanged(ChangeEvent var1) {
      int var3 = this.a.getValue();
      this.a.a.a((float)var3 / 100.0F);
      int var2 = (int)(this.a.a.a() * 100.0F);
      if (var3 != var2) {
         this.a.setValue(var2);
      }

   }

   // $FF: synthetic method
   static nl a(xn var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static aee a(xn var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static hm a(xn var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static void a(xn var0, int var1) {
      String var2;
      if ((var2 = String.format("Frame rate: %02d/%02d/%02d", var0.a.a.c(), var0.a.a.b(), var0.a.a.a())) != var0.a) {
         var0.a = var2;
         SwingUtilities.invokeLater(new rf(var0, var2));
      }

   }

   // $FF: synthetic method
   static JLabel a(xn var0) {
      return var0.c;
   }
}
