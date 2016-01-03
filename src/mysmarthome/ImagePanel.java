/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysmarthome;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author ktams
 */
public class ImagePanel extends Panel {
    private static final long serialVersionUID = 1L;
    private Image             imageOrg         = null;
    private Image             image            = null;

    {
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(final ComponentEvent e) {
                final int w = ImagePanel.this.getWidth();
                final int h = ImagePanel.this.getHeight();
                image = w > 0 && h > 0 ? imageOrg.getScaledInstance(w, h, Image.SCALE_SMOOTH) : imageOrg;
                ImagePanel.this.repaint();
            }
        });
    }

    public ImagePanel(final Image i) {
        imageOrg = i;
        image = i;
    }


//   public void setImage(Image image) {
 //     this.image = image;
  //    repaint();
   //}
 
   public Dimension getPreferredSize() {
       return new Dimension(image.getWidth(this), image.getHeight(this));
   }
 
    @Override
    public void paint(Graphics g) {
       super.paint(g);
       if(image != null) {
          g.drawImage(image, 0, 0, null);
       }
    }
}
