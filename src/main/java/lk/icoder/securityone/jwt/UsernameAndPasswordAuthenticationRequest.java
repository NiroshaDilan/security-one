package lk.icoder.securityone.jwt;

/**
 * @Project security-one
 * @Author DILAN on 12/23/2021
 */
public class UsernameAndPasswordAuthenticationRequest {

   private String username;
   private String password;

   public UsernameAndPasswordAuthenticationRequest() {
   }

   public String getUsername() {
      return username;
   }

   public void setUsername(String username) {
      this.username = username;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }
}
