package pack;

import pack.HeartBeatThread.OnNewMsgListener;
import pack.WaitScanAndLoginThread.OnScanListener;

public class WeeeeeChatDemo {

	public static void main(String[] args) {
		WeChatClass weChat=new WeChatClass();
		weChat.setmScanListener(new OnScanListener() {
			
			@Override
			public void onSure() {
				System.out.println("��½�ɹ�");
				
			}
			
			@Override
			public void onScan() {
				System.out.println("�Ѿ�ɨ��ɹ����ȴ�ȷ�ϵ�½");
				
			}
		});
		weChat.setmNewMsgListener(new OnNewMsgListener() {
			
			@Override
			public void onNewMsg(String text) {//ֻ����Ⱥ��Ϣ
				System.out.println("���յ���Ϣ:"+text);
				
			}

			@Override
			public void startBeat() {
				System.out.println("��ʼ����");
				
			}
		});
		weChat.gogogo();
		
	}

}
