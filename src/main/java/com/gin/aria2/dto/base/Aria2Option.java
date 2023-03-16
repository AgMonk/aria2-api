package com.gin.aria2.dto.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gin.aria2.response.Aria2Response;
import lombok.Getter;
import lombok.Setter;

/**
 * <a href="https://aria2.github.io/manual/en/html/aria2c.html#input-file">下载参数</a>
 * @author bx002
 */
@Getter
@Setter
public class Aria2Option implements Cloneable {
    @JsonProperty("all-proxy")
    String allProxy;
    @JsonProperty("all-proxy-passwd")
    String allProxyPasswd;
    @JsonProperty("all-proxy-user")
    String allProxyUser;
    @JsonProperty("allow-overwrite")
    Boolean allowOverwrite;
    @JsonProperty("allow-piece-length-change")
    Boolean allowPieceLengthChange;
    @JsonProperty("always-resume")
    Boolean alwaysResume;
    @JsonProperty("async-dns")
    Boolean asyncDns;
    @JsonProperty("auto-file-renaming")
    Boolean autoFileRenaming;
    @JsonProperty("bt-enable-hook-after-hash-check")
    Boolean btEnableHookAfterHashCheck;
    @JsonProperty("bt-enable-lpd")
    Boolean btEnableLpd;
    @JsonProperty("bt-exclude-tracker")
    String btExcludeTracker;
    @JsonProperty("bt-external-ip")
    String btExternalIp;
    @JsonProperty("bt-force-encryption")
    Boolean btForceEncryption;
    @JsonProperty("bt-hash-check-seed")
    Boolean btHashCheckSeed;
    @JsonProperty("bt-load-saved-metadata")
    Boolean btLoadSavedMetadata;
    @JsonProperty("bt-max-peers")
    Integer btMaxPeers;
    @JsonProperty("bt-metadata-only")
    Boolean btMetadataOnly;
    @JsonProperty("bt-min-crypto-level")
    String btMinCryptoLevel;
    @JsonProperty("bt-prioritize-piece")
    String btPrioritizePiece;
    @JsonProperty("bt-remove-unselected-file")
    Boolean btRemoveUnselectedFile;
    @JsonProperty("bt-request-peer-speed-limit")
    Integer btRequestPeerSpeedLimit;
    @JsonProperty("bt-require-crypto")
    Boolean btRequireCrypto;
    @JsonProperty("bt-save-metadata")
    Boolean btSaveMetadata;
    @JsonProperty("bt-seed-unverified")
    Boolean btSeedUnverified;
    @JsonProperty("bt-stop-timeout")
    Integer btStopTimeout;
    @JsonProperty("bt-tracker")
    String btTracker;
    @JsonProperty("bt-tracker-connect-timeout")
    Integer btTrackerConnectTimeout;
    @JsonProperty("bt-tracker-interval")
    Integer btTrackerInterval;
    @JsonProperty("bt-tracker-timeout")
    Integer btTrackerTimeout;
    @JsonProperty("check-integrity")
    Boolean checkIntegrity;
    @JsonProperty("checksum")
    Boolean checksum;
    @JsonProperty("conditional-get")
    Boolean conditionalGet;
    @JsonProperty("connect-timeout")
    Integer connectTimeout;
    @JsonProperty("content-disposition-default-utf8")
    Boolean contentDispositionDefaultUtf8;
    @JsonProperty("continue")
    Boolean continues;
    @JsonProperty("dir")
    String dir;
    @JsonProperty("dry-run")
    Boolean dryRun;
    @JsonProperty("enable-http-keep-alive")
    Boolean enableHttpKeepAlive;
    @JsonProperty("enable-http-pipelining")
    Boolean enableHttpPipelining;
    @JsonProperty("enable-mmap")
    Boolean enableMmap;
    @JsonProperty("enable-peer-exchange")
    Boolean enablePeerExchange;
    @JsonProperty("file-allocation")
    String fileAllocation;
    @JsonProperty("follow-metalink")
    Boolean followMetalink;
    @JsonProperty("follow-torrent")
    Boolean followTorrent;
    @JsonProperty("force-save")
    Boolean forceSave;
    @JsonProperty("ftp-passwd")
    String ftpPasswd;
    @JsonProperty("ftp-pasv")
    Boolean ftpPasv;
    @JsonProperty("ftp-proxy")
    String ftpProxy;
    @JsonProperty("ftp-proxy-passwd")
    String ftpProxyPasswd;
    @JsonProperty("ftp-proxy-user")
    String ftpProxyUser;
    @JsonProperty("ftp-reuse-connection")
    Boolean ftpReuseConnection;
    @JsonProperty("ftp-type")
    String ftpType;
    @JsonProperty("ftp-user")
    String ftpUser;
    @JsonProperty("gid")
    String gid;
    @JsonProperty("hash-check-only")
    Boolean hashCheckOnly;
    @JsonProperty("header")
    String header;
    @JsonProperty("http-accept-gzip")
    Boolean httpAcceptGzip;
    @JsonProperty("http-auth-challenge")
    Boolean httpAuthChallenge;
    @JsonProperty("http-no-cache")
    Boolean httpNoCache;
    @JsonProperty("http-passwd")
    String httpPasswd;
    @JsonProperty("http-proxy")
    String httpProxy;
    @JsonProperty("http-proxy-passwd")
    String httpProxyPasswd;
    @JsonProperty("http-proxy-user")
    String httpProxyUser;
    @JsonProperty("http-user")
    String httpUser;
    @JsonProperty("https-proxy")
    String httpsProxy;
    @JsonProperty("https-proxy-passwd")
    String httpsProxyPasswd;
    @JsonProperty("https-proxy-user")
    String httpsProxyUser;
    @JsonProperty("index-out")
    String indexOut;
    @JsonProperty("lowest-speed-limit")
    Integer lowestSpeedLimit;
    @JsonProperty("max-connection-per-server")
    Integer maxConnectionPerServer;
    @JsonProperty("max-download-limit")
    Integer maxDownloadLimit;
    @JsonProperty("max-file-not-found")
    Integer maxFileNotFound;
    @JsonProperty("max-mmap-limit")
    Long maxMmapLimit;
    @JsonProperty("max-resume-failure-tries")
    Integer maxResumeFailureTries;
    @JsonProperty("max-tries")
    Integer maxTries;
    @JsonProperty("max-upload-limit")
    Integer maxUploadLimit;
    @JsonProperty("metalink-base-uri")
    String metalinkBaseUri;
    @JsonProperty("metalink-enable-unique-protocol")
    Boolean metalinkEnableUniqueProtocol;
    @JsonProperty("metalink-language")
    String metalinkLanguage;
    @JsonProperty("metalink-location")
    String metalinkLocation;
    @JsonProperty("metalink-os")
    String metalinkOs;
    @JsonProperty("metalink-preferred-protocol")
    String metalinkPreferredProtocol;
    @JsonProperty("metalink-version")
    String metalinkVersion;
    @JsonProperty("min-split-size")
    Integer minSplitSize;
    @JsonProperty("no-file-allocation-limit")
    Integer noFileAllocationLimit;
    @JsonProperty("no-netrc")
    Boolean noNetrc;
    @JsonProperty("no-proxy")
    String noProxy;
    /**
     * 文件名
     */
    @JsonProperty("out")
    String out;
    @JsonProperty("parameterized-uri")
    Boolean parameterizedUri;
    @JsonProperty("pause")
    Boolean pause;
    @JsonProperty("pause-metadata")
    Boolean pauseMetadata;
    @JsonProperty("piece-length")
    Integer pieceLength;
    @JsonProperty("proxy-method")
    String proxyMethod;
    @JsonProperty("realtime-chunk-checksum")
    Boolean realtimeChunkChecksum;
    @JsonProperty("referer")
    String referer;
    @JsonProperty("remote-time")
    Boolean remoteTime;
    @JsonProperty("remove-control-file")
    Boolean removeControlFile;
    @JsonProperty("retry-wait")
    Integer retryWait;
    @JsonProperty("reuse-uri")
    Boolean reuseUri;
    @JsonProperty("rpc-save-upload-metadata")
    Boolean rpcSaveUploadMetadata;
    @JsonProperty("save-not-found")
    Boolean saveNotFound;
    @JsonProperty("seed-ratio")
    Double seedRatio;
    @JsonProperty("seed-time")
    Integer seedTime;
    @JsonProperty("select-file")
    String selectFile;
    @JsonProperty("split")
    Integer split;
    @JsonProperty("ssh-host-key-md")
    String sshHostKeyMd;
    @JsonProperty("stream-piece-selector")
    String streamPieceSelector;
    @JsonProperty("timeout")
    Integer timeout;
    @JsonProperty("uri-selector")
    String uriSelector;
    @JsonProperty("use-head")
    Boolean useHead;
    @JsonProperty("user-agent")
    String userAgent;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static class Response extends Aria2Response<Aria2Option> {
    }
}
