package com.lucafacchini.objects;

import javax.imageio.ImageIO;

public class Door_Object extends SuperObject {
    public Door_Object() {
        name = "Door";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/door.png"));
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}