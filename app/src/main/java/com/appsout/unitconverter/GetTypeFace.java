package com.appsout.unitconverter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GetTypeFace
{
	public static final int TypeFaceRegular = 0;
	public static final int TypeFaceSemiBold = 1;
	public static final int TypeFaceBold = 2;
	public static final int TypeFaceItelic = 3;
	public static final int TypeFaceCaption = 4;

	/***
	 * if type=0 return regular typeface if type=1 return semibold typeface if type=2 return bold type face if type=3
	 * return itelic type face
	 * 
	 * @param type
	 * @param context
	 * @return TypeFace
	 */
	public static Typeface get_type_face1(int type, Context context)
	{
		if (type == TypeFaceRegular)
		{
			return Typeface.createFromAsset(context.getAssets(), "fonts/DejaVuSans.ttf");
		}

		else
		{
			return Typeface.createFromAsset(context.getAssets(), "fonts/DejaVuSans-Bold.ttf");
		}

	}

	public static void set_type_face(int type, Context context, View view)
	{
		Typeface typeface;
		if (type == TypeFaceRegular)
		{
			typeface = Typeface.createFromAsset(context.getAssets(), "fonts/DejaVuSans.ttf");
		}

		else
		{
			typeface = Typeface.createFromAsset(context.getAssets(), "fonts/DejaVuSans-Bold.ttf");
		}

		if (view instanceof TextView)
		{
			((TextView) view).setTypeface(typeface);
		}
		else if (view instanceof EditText)
		{
			((EditText) view).setTypeface(typeface);
		}

		else if (view instanceof Button)
		{
			((Button) view).setTypeface(typeface);
		}

	}
}
