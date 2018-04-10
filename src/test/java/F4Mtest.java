import com.neotys.codec.HDS.F4MHttpResponse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class F4Mtest {
	@Test
	public void F4Mtestcontent()
	{
	  String test ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
              "<manifest xmlns=\"http://ns.adobe.com/f4m/1.0\">\n" +
              "  <id>15MmJ4MDE6Mx2WVHyBpuchDGisVxXO62_1</id>\n" +
              "  <streamType>recorded</streamType>\n" +
              "  <duration>60.026511</duration>\n" +
              "  <bootstrapInfo id=\"bootstrap0\" profile=\"named\">CgkJQUFBQWkyRmljM1FBQUFBQUFBQUFBZ0FBQUFQb0FBQUFBQUFBNnJBQUFBQUFBQUFBQUFBQUFBQUFBUUFBQUJsaGMzSjBBQUFBQUFBQUFBQUJBQUFBQVFBQUFBY0JBQUFBUm1GbWNuUUFBQUFBQUFBRDZBQUFBQUFEQUFBQUFRQUFBQUFBQUFBQUFBQW5FQUFBQUFjQUFBQUFBQURxWUFBQUFGQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBPT0KCQ==</bootstrapInfo>\n" +
              "  <media bitrate=\"250\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085305\" url=\"MozO9qW2pqQKF0nlmHe7rtmIjilWz6-GoVc41A3jyj-A1I8wnETdQX_Ba_RMkOVy/video_250_320\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFIUUFBQUFBQUFBQUJtaGxhV2RvZEFCQVpvQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFDZ0FBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"350\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085309\" url=\"Wrx_OP7BAS5YNQIRYt030w1bOE79MX8Uiv8P_bpxuQ_bAjJvjb_aMmbMu47BcZrc/video_350_512\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFJQUFBQUFBQUFBQUJtaGxhV2RvZEFCQWNnQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFEVUFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"500\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085313\" url=\"7RLtGTZCQY_Nri0SII6pO-0eqO7yGnsdBb1bjy-7LQegpBf08NbokGlNQni12lSV/video_500_512\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFJQUFBQUFBQUFBQUJtaGxhV2RvZEFCQWNnQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFEVUFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"800\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085319\" url=\"90UAwzGWhmD7teyRfDiuemGXj9epf0So0WPLG4x4uMjqOvpz1jNHrx0XA1jJNRpm/video_800_640\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFJUUFBQUFBQUFBQUJtaGxhV2RvZEFCQWRvQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFENEFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"1200\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085323\" url=\"aHi3PBanWUcwAbFPfQRasfGeqc2twbect4pAXMQnBW8Z6ZmZgfGw9gpVtKSVI7it/video_1200_640\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFJUUFBQUFBQUFBQUJtaGxhV2RvZEFCQWRvQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFENEFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"1800\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085329\" url=\"jp1zhvzPTGdKA78S_uxJlXXwEPnbDGeTG7R4tB8v-F0jf1nvhEG08PJ_I0hnwIyX/video_1800_1280\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFKUUFBQUFBQUFBQUJtaGxhV2RvZEFCQWhvQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFEOEFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "  <media bitrate=\"2700\" bootstrapInfoId=\"bootstrap0\" streamId=\"212085333\" url=\"9CQ6bCYitWdqrU7bYME4EZgjpQMDnt0vysiC19wziTbpOmb23bF6TVMpdlX4KXf_/video_2700_1280\">\n" +
              "    <metadata>CgkJCUFnQUtiMjVOWlhSaFJHRjBZUWdBQUFBQUFBaGtkWEpoZEdsdmJnQkFUZzljS1BYQ2p3QUZkMmxrZEdnQVFKUUFBQUFBQUFBQUJtaGxhV2RvZEFCQWhvQUFBQUFBQUFBTWRtbGtaVzlqYjJSbFkybGtBZ0FFWVhaak1RQU1ZWFZrYVc5amIyUmxZMmxrQWdBRWJYQTBZUUFLWVhaamNISnZabWxzWlFCQVVJQUFBQUFBQUFBSVlYWmpiR1YyWld3QVFEOEFBQUFBQUFBQURuWnBaR1Z2Wm5KaGJXVnlZWFJsQUVBNUFBQUFBQUFBQUE5aGRXUnBiM05oYlhCc1pYSmhkR1VBUU9XSWdBQUFBQUFBRFdGMVpHbHZZMmhoYm01bGJITUFRQUFBQUFBQUFBQUFDWFJ5WVdOcmFXNW1id29BQUFBQ0F3QUdiR1Z1WjNSb0FFRW5mQUFBQUFBQUFBbDBhVzFsYzJOaGJHVUFRTWtBQUFBQUFBQUFDR3hoYm1kMVlXZGxBZ0FEZFc1a0FBQUpBd0FHYkdWdVozUm9BRUZFTWt1QUFBQUFBQWwwYVcxbGMyTmhiR1VBUU9XSWdBQUFBQUFBQ0d4aGJtZDFZV2RsQWdBRGRXNWtBQUFKQUFBSgoJCQ==</metadata>\n" +
              "  </media>\n" +
              "</manifest>";
	  
	  @SuppressWarnings("unused")
	F4MHttpResponse req=new F4MHttpResponse(test.getBytes());
	}
	  
}