package game;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;

public class MyConst {
	public static boolean DEBUGGING=true;
	
	public static final Random RAND=new Random();
	public static final int APP_WIDTH = 1920;
    public static final int APP_HEIGHT = 1080;
    public static final float VIEW_SCALE=1f;
    public static final float MAP_SCALE=1f;
    public static final float PIX_IN_M=100;
    public static final float ORG_TILE_WIDTH=64;
    public static final float TILES_IN_M=1f;
    
    public static final short CATEGORY_PLAYER = 1; 
    public static final short CATEGORY_BULLETS = 2; 
    public static final short CATEGORY_SCENERY = 4;
    public static final short CATEGORY_ENEMY = 8;
    public static final short CATEGORY_ON_FLOOR=16;
    public static final short MASK_LIGHTS=CATEGORY_SCENERY;
    public static final short MASK_BULLETS=CATEGORY_ENEMY|CATEGORY_PLAYER|CATEGORY_SCENERY;
    
    public static final short MASK_PLAYER=CATEGORY_ENEMY|CATEGORY_SCENERY|CATEGORY_BULLETS;
    public static final Sound PISTOLSOUND = Gdx.audio.newSound(Gdx.files.internal("sound/Pistol.wav"));
    
    public static float volumeSFX=1;
    public static float volumeMusic=1;
    
public static Skin skin;
public static BitmapFont font =new BitmapFont();
    
    public static void createSkin(){
    	font=new BitmapFont();
    	font.getData().setScale(0.01f);
    	
    	
        skin = new Skin();
	
        //TEXTURES///////
	    Pixmap pixmap = new Pixmap(100, 100, Format.RGBA8888);
		pixmap.setColor(Color.PURPLE);
		pixmap.fill();
		skin.add("purple", new Texture(pixmap));
	            
	    pixmap = new Pixmap(10, 100, Format.RGBA8888);
		pixmap.setColor(Color.BLACK);
		pixmap.fill();
		skin.add("black", new Texture(pixmap));
		
		pixmap = new Pixmap(10, 100, Format.RGBA8888);
		pixmap.setColor(Color.DARK_GRAY);
		pixmap.fill();
		skin.add("gray", new Texture(pixmap));
		/////////////////////////////
	
		//FONTS/////////////////////
		BitmapFont bfont=new BitmapFont(Gdx.files.internal("fonts/mainFont.fnt"));
		bfont.getData().setScale(0.02f);
		
		skin.add("default",bfont);
		
		bfont=new BitmapFont(Gdx.files.internal("fonts/mainFont.fnt"));
		bfont.getData().setScale(3f);
		//bfont.setColor(Color.BLACK);
		skin.add("titleFont",bfont);
		
		bfont=new BitmapFont();
		bfont.getData().setScale(1f);
		skin.add("scoreFont",bfont);
		/////////////////////////////
		
		// STYLES//////////////////////////
		TextButtonStyle textButtonStyle = new TextButtonStyle();
		textButtonStyle.up = skin.newDrawable("purple", Color.DARK_GRAY);
		textButtonStyle.down = skin.newDrawable("purple", Color.DARK_GRAY);
		textButtonStyle.checked = skin.newDrawable("purple", Color.BLUE);
		textButtonStyle.over = skin.newDrawable("purple", Color.LIGHT_GRAY);
	    textButtonStyle.font = skin.getFont("default");
	    skin.add("default", textButtonStyle);
        
        LabelStyle label=new LabelStyle();
        label.font=skin.getFont("default");
        skin.add("default", label);
        
        label=new LabelStyle();
        label.font=skin.getFont("scoreFont");
        label.fontColor=Color.MAGENTA;
        skin.add("score", label);
        
        label=new LabelStyle();
        label.font=skin.getFont("titleFont");
        label.fontColor=Color.GREEN;
        skin.add("title", label);
        
        TextFieldStyle fieldStyle=new TextFieldStyle();
        fieldStyle.font=skin.getFont("default");
        fieldStyle.fontColor=Color.MAGENTA;
        fieldStyle.background=skin.getDrawable("gray");
        fieldStyle.cursor=skin.getDrawable("purple");
        fieldStyle.cursor.setMinWidth(2f);
        skin.add("default", fieldStyle);
        /////////////////////////////////////////////
	            
    }
    
    
}
