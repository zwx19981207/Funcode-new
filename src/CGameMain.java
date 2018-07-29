/**
 * @(#)CGameMain.java
 *
 *
 * @author 
 * @version 1.00
 */


import FunCode.JSystem;
import FunCode.JSprite;
import FunCode.JStaticSprite;
import FunCode.JAnimateSprite;
import FunCode.JTextSprite;
import FunCode.JEffect;
import FunCode.JSound;


public class CGameMain 
{
	public static CGameMain g_GameMain;				// �����Ψһʵ��
	public int				m_iGameState =	0;		// ��Ϸ״̬��0 -- ��Ϸ�����ȴ���ʼ״̬��1 -- ���¿ո����ʼ����ʼ����Ϸ��2 -- ��Ϸ������
	
	static
	{
		g_GameMain = new CGameMain();
	}
	
	//=============================================================================
	//
	// ���췽��
    public CGameMain() 
    {
    	//Ϊ������Ϸ�Ƚ�m_iGameState�ı�
		m_iGameState = 1;
    }
    
    //=============================================================================
    // ��Ϸ��ѭ�����˺���������ͣ�ĵ��ã�����ÿˢ��һ����Ļ���˺�����������һ��
	// ���Դ�����Ϸ�Ŀ�ʼ�������С������ȸ���״̬. 
	// ��������fDeltaTime : �ϴε��ñ��������˴ε��ñ�������ʱ��������λ����
    public void GameMainLoop( float fDeltaTime )
    {
    	switch( m_iGameState )
		{
			// ��ʼ����Ϸ�������һ���������
		case 1:
			{
				GameInit();
				m_iGameState	=	2; // ��ʼ��֮�󣬽���Ϸ״̬����Ϊ������
			}
			break;
	
			// ��Ϸ�����У�����������Ϸ�߼�
		case 2:
			{
				// �޸Ĵ˴���Ϸѭ�������������ȷ��Ϸ�߼�
				if( true )
				{
					GameRun( fDeltaTime );
				}
				else
				{
					// ��Ϸ������������Ϸ���㺯����������Ϸ״̬�޸�Ϊ����״̬
					m_iGameState	=	0;
					GameEnd();
				}
			}
			break;
	
			// ��Ϸ����/�ȴ����ո����ʼ
		case 0:
		default:
			break;
		};
    }
    
	//==============================================================================
	//
	// ÿ�ֿ�ʼǰ���г�ʼ���������һ���������
	public void	GameInit()
	{
	}
	
	//==============================================================================
	//
	// ÿ����Ϸ������
	public void	GameRun( float fDeltaTime )
	{
	}
	
	//==============================================================================
	//
	// ������Ϸ����
	public void	GameEnd()
	{
	}
    
    // dOnMouseMove������ƶ��󽫱����õķ���
	// ���� fMouseX, fMouseY��Ϊ��굱ǰ����
	//
    public void	OnMouseMove( float fMouseX, float fMouseY )
	{
	}
	
	// dOnMouseClick����갴�º󽫱����õķ���
	// ���� iMouseType����갴��ֵ���� enum MouseTypes ����
	// ���� fMouseX, fMouseY��Ϊ��굱ǰ����
	//	
	public void	OnMouseClick( int iMouseType, float fMouseX, float fMouseY )
	{		
	}

	// dOnMouseUp����굯��󽫱����õķ���
	// ���� iMouseType����갴��ֵ���� enum MouseTypes ����
	// ���� fMouseX, fMouseY��Ϊ��굱ǰ����
	//	
	public void	OnMouseUp( int iMouseType, float fMouseX, float fMouseY )
	{		
	}
    
	// dOnKeyDown�����̱����º󽫱����õķ���
	// ���� iKey�������µļ���ֵ�� enum KeyCodes �궨��
	// ���� bAltPress, bShiftPress��bCtrlPress�������ϵĹ��ܼ�Alt��Ctrl��Shift��ǰ�Ƿ�Ҳ���ڰ���״̬
	//    
    public void	OnKeyDown( int iKey, boolean bAltPress, boolean bShiftPress, boolean bCtrlPress )
    {
    }
    
	// dOnKeyUp�����̰�������󽫱����õķ���
	// ���� iKey������ļ���ֵ�� enum KeyCodes �궨��
	//    
	public void	OnKeyUp( int iKey )
	{
	}
	
	// dOnSpriteColSprite�������뾫����ײ�󽫱����õķ���
	// ����֮��Ҫ������ײ�������ڱ༭�����ߴ��������þ��鷢�ͼ�������ײ
	// ���� szSrcName��������ײ�ľ�������
	// ���� szTarName������ײ�ľ�������
	//	
	public void	OnSpriteColSprite( String szSrcName, String szTarName )
	{
	}
	
	// dOnSpriteColWorldLimit������������߽���ײ�󽫱����õķ���
	// ����֮��Ҫ������ײ�������ڱ༭�����ߴ��������þ��������߽�����
	// ���� szName����ײ���߽�ľ�������
	// ���� iColSide����ײ���ı߽� 0 ��ߣ�1 �ұߣ�2 �ϱߣ�3 �±�
	//	
	public void	OnSpriteColWorldLimit( String szName, int iColSide )
	{
	}
}
