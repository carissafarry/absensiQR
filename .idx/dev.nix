# To learn more about how to use Nix to configure your environment
# see: https://developers.google.com/idx/guides/customize-idx-env
{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "stable-23.11"; # or "unstable"
  # Use https://search.nixos.org/packages to find packages
  packages = [
    pkgs.zulu17
    pkgs.maven
    pkgs.mysql80
    pkgs.mysql_jdbc
  ];
  # Sets environment variables in the workspace
  env = {
    JAVA_HOME = "${pkgs.openjdk17}/lib/openjdk";
  };
  idx = {
    # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
    extensions = [
      "vscjava.vscode-java-pack"
      "vscjava.vscode-java-dependency"
      "vscjava.vscode-maven"
      "vscjava.vscode-spring-boot-dashboard"
      "vscjava.vscode-spring-initializr"
      
    ];
    workspace = {
      # Runs when a workspace is first created with this `dev.nix` file
      onCreate = {
        install = "mvn clean install";
      };
      # Runs when a workspace is (re)started
      onStart = {
        run-server = "PORT=3000 mvn spring-boot:run";
      };
    };
  };
  # See: https://nixos.wiki/wiki/Mysql
  services.mysql = {
    enable = true;
    package = pkgs.mysql80;
  };
}